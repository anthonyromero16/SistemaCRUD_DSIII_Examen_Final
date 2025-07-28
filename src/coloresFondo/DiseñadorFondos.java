/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coloresFondo;

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.table.*;

public class DiseñadorFondos extends JPanel {
    // Combinaciones de colores predefinidas
    public enum Combinacion {
        AZUL_MORADO(new Color(100, 149, 237), new Color(147, 112, 219)),
        VERDE_AZUL(new Color(46, 204, 113), new Color(52, 152, 219)),
        NARANJA_ROJO(new Color(230, 126, 34), new Color(231, 76, 60)),
        ROSA_PURPURA(new Color(255, 153, 204), new Color(153, 102, 204)),
        OCEANO(new Color(86, 204, 242), new Color(47, 128, 237));
        
        private final Color inicio;
        private final Color fin;
        
        Combinacion(Color inicio, Color fin) {
            this.inicio = inicio;
            this.fin = fin;
        }
        
        public Color getInicio() { return inicio; }
        public Color getFin() { return fin; }
    }
    
    private Color colorInicio;
    private Color colorFin;
    private boolean gradienteHorizontal;
    
    // Constructores (se mantienen igual)
    public DiseñadorFondos(Combinacion combinacion, boolean horizontal) {
        this(combinacion.getInicio(), combinacion.getFin(), horizontal);
    }
    
    public DiseñadorFondos(Color inicio, Color fin, boolean horizontal) {
        this.colorInicio = inicio;
        this.colorFin = fin;
        this.gradienteHorizontal = horizontal;
        setOpaque(false);
    }
    
    public DiseñadorFondos() {
        this(Combinacion.AZUL_MORADO, false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        GradientPaint gp = gradienteHorizontal ?
            new GradientPaint(0, 0, colorInicio, getWidth(), 0, colorFin) :
            new GradientPaint(0, 0, colorInicio, 0, getHeight(), colorFin);
        
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, getWidth(), getHeight());
    }
    
    // Métodos para configuración dinámica (se mantienen igual)
    public void setCombinacion(Combinacion combinacion) {
        this.colorInicio = combinacion.getInicio();
        this.colorFin = combinacion.getFin();
        repaint();
    }
    
    public void setColores(Color inicio, Color fin) {
        this.colorInicio = inicio;
        this.colorFin = fin;
        repaint();
    }
    
    public void setDireccion(boolean horizontal) {
        this.gradienteHorizontal = horizontal;
        repaint();
    }

    /************************
     * NUEVOS MÉTODOS PARA TABLAS Y TABBEDPANES
     ************************/
    
    // Método para configurar JTable
    public static void configurarTabla(JTable tabla, Combinacion combinacion) {
        tabla.setOpaque(false);
        tabla.setShowGrid(false);
        tabla.setForeground(Color.WHITE);
        tabla.setSelectionBackground(new Color(255, 255, 255, 100));
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        
        // Renderer personalizado para celdas
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(
                JTable table, Object value, boolean isSelected, 
                boolean hasFocus, int row, int column) {
                
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setOpaque(isSelected);
                setBackground(isSelected ? table.getSelectionBackground() : new Color(0, 0, 0, 0));
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        };
        
        // Aplicar renderer a todas las columnas
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        // Configurar scroll pane asociado
        if (tabla.getParent() instanceof JViewport) {
            JViewport viewport = (JViewport) tabla.getParent();
            viewport.setOpaque(false);
            if (viewport.getParent() instanceof JScrollPane) {
                JScrollPane scrollPane = (JScrollPane) viewport.getParent();
                scrollPane.setOpaque(false);
                scrollPane.getViewport().setOpaque(false);
                scrollPane.setBorder(BorderFactory.createEmptyBorder());
            }
        }
    }
    
    // Método para configurar JTabbedPane
    public static void configurarTabbedPane(JTabbedPane tabbedPane, Combinacion combinacion, boolean horizontal) {
        tabbedPane.setOpaque(false);
        
        // UI personalizada
        tabbedPane.setUI(new BasicTabbedPaneUI() {
            @Override
            protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
                // Eliminar bordes por defecto
            }
            
            @Override
            protected void paintTabBackground(Graphics g, int tabPlacement, 
                int tabIndex, int x, int y, int w, int h, boolean isSelected) {
                
                Graphics2D g2d = (Graphics2D) g;
                Color colorTab = isSelected ? combinacion.getFin() : combinacion.getInicio().darker();
                g2d.setColor(new Color(colorTab.getRed(), colorTab.getGreen(), colorTab.getBlue(), 150));
                g2d.fillRoundRect(x, y, w, h, 15, 15);
            }
            
            @Override
            protected void paintTabBorder(Graphics g, int tabPlacement,
                int tabIndex, int x, int y, int w, int h, boolean isSelected) {
                // Sin bordes
            }
        });
        
        // Configurar pestañas
        tabbedPane.setForeground(Color.WHITE);
        tabbedPane.setFont(new Font("Segoe UI", Font.BOLD, 12));
    }
}