package sudokuresolve;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;


public class interfaz extends javax.swing.JFrame {

    private int filas = 9;
    private int[][] valor = new int[filas][filas];
    
    public interfaz() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        jButton1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        btnSel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        field14 = new javax.swing.JTextField();
        field26 = new javax.swing.JTextField();
        field17 = new javax.swing.JTextField();
        field16 = new javax.swing.JTextField();
        field13 = new javax.swing.JTextField();
        field18 = new javax.swing.JTextField();
        field12 = new javax.swing.JTextField();
        field2 = new javax.swing.JTextField();
        field10 = new javax.swing.JTextField();
        field19 = new javax.swing.JTextField();
        field24 = new javax.swing.JTextField();
        field23 = new javax.swing.JTextField();
        field25 = new javax.swing.JTextField();
        field27 = new javax.swing.JTextField();
        field9 = new javax.swing.JTextField();
        field7 = new javax.swing.JTextField();
        field8 = new javax.swing.JTextField();
        field20 = new javax.swing.JTextField();
        field21 = new javax.swing.JTextField();
        field22 = new javax.swing.JTextField();
        field15 = new javax.swing.JTextField();
        field1 = new javax.swing.JTextField();
        field4 = new javax.swing.JTextField();
        field5 = new javax.swing.JTextField();
        field11 = new javax.swing.JTextField();
        field3 = new javax.swing.JTextField();
        field6 = new javax.swing.JTextField();
        field28 = new javax.swing.JTextField();
        field29 = new javax.swing.JTextField();
        field30 = new javax.swing.JTextField();
        field31 = new javax.swing.JTextField();
        field32 = new javax.swing.JTextField();
        field33 = new javax.swing.JTextField();
        field34 = new javax.swing.JTextField();
        field36 = new javax.swing.JTextField();
        field35 = new javax.swing.JTextField();
        field37 = new javax.swing.JTextField();
        field40 = new javax.swing.JTextField();
        field42 = new javax.swing.JTextField();
        field38 = new javax.swing.JTextField();
        field39 = new javax.swing.JTextField();
        field41 = new javax.swing.JTextField();
        field45 = new javax.swing.JTextField();
        field44 = new javax.swing.JTextField();
        field43 = new javax.swing.JTextField();
        field46 = new javax.swing.JTextField();
        field47 = new javax.swing.JTextField();
        field49 = new javax.swing.JTextField();
        field50 = new javax.swing.JTextField();
        field51 = new javax.swing.JTextField();
        field48 = new javax.swing.JTextField();
        field52 = new javax.swing.JTextField();
        field54 = new javax.swing.JTextField();
        field55 = new javax.swing.JTextField();
        field53 = new javax.swing.JTextField();
        field57 = new javax.swing.JTextField();
        field56 = new javax.swing.JTextField();
        field58 = new javax.swing.JTextField();
        field63 = new javax.swing.JTextField();
        field59 = new javax.swing.JTextField();
        field60 = new javax.swing.JTextField();
        field61 = new javax.swing.JTextField();
        field62 = new javax.swing.JTextField();
        field65 = new javax.swing.JTextField();
        field64 = new javax.swing.JTextField();
        field66 = new javax.swing.JTextField();
        field68 = new javax.swing.JTextField();
        field67 = new javax.swing.JTextField();
        field69 = new javax.swing.JTextField();
        field70 = new javax.swing.JTextField();
        field71 = new javax.swing.JTextField();
        field72 = new javax.swing.JTextField();
        field75 = new javax.swing.JTextField();
        field73 = new javax.swing.JTextField();
        field74 = new javax.swing.JTextField();
        field79 = new javax.swing.JTextField();
        field77 = new javax.swing.JTextField();
        field76 = new javax.swing.JTextField();
        field78 = new javax.swing.JTextField();
        field81 = new javax.swing.JTextField();
        field80 = new javax.swing.JTextField();
        txaArchivo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Seleccione el archivo de texto con sus pistas");

        btnSel.setBackground(new java.awt.Color(255, 22, 22));
        btnSel.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnSel.setForeground(new java.awt.Color(255, 255, 255));
        btnSel.setText("Seleccionar...");
        btnSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Numeros Posibles");

        jButton1.setBackground(new java.awt.Color(47, 169, 58));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sudokuresolve/logo.png"))); // NOI18N

        field14.setEditable(false);
        field14.setBackground(new java.awt.Color(204, 255, 204));
        field14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field14MouseClicked(evt);
            }
        });
        field14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field14ActionPerformed(evt);
            }
        });

        field26.setEditable(false);
        field26.setBackground(new java.awt.Color(255, 204, 204));
        field26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field26MouseClicked(evt);
            }
        });
        field26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field26ActionPerformed(evt);
            }
        });

        field17.setEditable(false);
        field17.setBackground(new java.awt.Color(255, 204, 204));
        field17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field17MouseClicked(evt);
            }
        });
        field17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field17ActionPerformed(evt);
            }
        });

        field16.setEditable(false);
        field16.setBackground(new java.awt.Color(255, 204, 204));
        field16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field16MouseClicked(evt);
            }
        });
        field16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field16ActionPerformed(evt);
            }
        });

        field13.setEditable(false);
        field13.setBackground(new java.awt.Color(204, 255, 204));
        field13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field13MouseClicked(evt);
            }
        });
        field13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field13ActionPerformed(evt);
            }
        });

        field18.setEditable(false);
        field18.setBackground(new java.awt.Color(255, 204, 204));
        field18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field18MouseClicked(evt);
            }
        });
        field18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field18ActionPerformed(evt);
            }
        });

        field12.setEditable(false);
        field12.setBackground(new java.awt.Color(255, 204, 204));
        field12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field12MouseClicked(evt);
            }
        });
        field12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field12ActionPerformed(evt);
            }
        });

        field2.setEditable(false);
        field2.setBackground(new java.awt.Color(255, 204, 204));
        field2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field2MouseClicked(evt);
            }
        });
        field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field2ActionPerformed(evt);
            }
        });

        field10.setEditable(false);
        field10.setBackground(new java.awt.Color(255, 204, 204));
        field10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field10MouseClicked(evt);
            }
        });
        field10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field10ActionPerformed(evt);
            }
        });

        field19.setEditable(false);
        field19.setBackground(new java.awt.Color(255, 204, 204));
        field19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field19MouseClicked(evt);
            }
        });
        field19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field19ActionPerformed(evt);
            }
        });

        field24.setEditable(false);
        field24.setBackground(new java.awt.Color(204, 255, 204));
        field24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field24MouseClicked(evt);
            }
        });
        field24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field24ActionPerformed(evt);
            }
        });

        field23.setEditable(false);
        field23.setBackground(new java.awt.Color(204, 255, 204));
        field23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field23MouseClicked(evt);
            }
        });
        field23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field23ActionPerformed(evt);
            }
        });

        field25.setEditable(false);
        field25.setBackground(new java.awt.Color(255, 204, 204));
        field25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field25MouseClicked(evt);
            }
        });
        field25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field25ActionPerformed(evt);
            }
        });

        field27.setEditable(false);
        field27.setBackground(new java.awt.Color(255, 204, 204));
        field27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field27MouseClicked(evt);
            }
        });
        field27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field27ActionPerformed(evt);
            }
        });

        field9.setEditable(false);
        field9.setBackground(new java.awt.Color(255, 204, 204));
        field9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field9MouseClicked(evt);
            }
        });
        field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field9ActionPerformed(evt);
            }
        });

        field7.setEditable(false);
        field7.setBackground(new java.awt.Color(255, 204, 204));
        field7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field7MouseClicked(evt);
            }
        });
        field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field7ActionPerformed(evt);
            }
        });

        field8.setEditable(false);
        field8.setBackground(new java.awt.Color(255, 204, 204));
        field8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field8MouseClicked(evt);
            }
        });
        field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field8ActionPerformed(evt);
            }
        });

        field20.setEditable(false);
        field20.setBackground(new java.awt.Color(255, 204, 204));
        field20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field20MouseClicked(evt);
            }
        });
        field20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field20ActionPerformed(evt);
            }
        });

        field21.setEditable(false);
        field21.setBackground(new java.awt.Color(255, 204, 204));
        field21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field21MouseClicked(evt);
            }
        });
        field21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field21ActionPerformed(evt);
            }
        });

        field22.setEditable(false);
        field22.setBackground(new java.awt.Color(204, 255, 204));
        field22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field22MouseClicked(evt);
            }
        });
        field22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field22ActionPerformed(evt);
            }
        });

        field15.setEditable(false);
        field15.setBackground(new java.awt.Color(204, 255, 204));
        field15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field15MouseClicked(evt);
            }
        });
        field15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field15ActionPerformed(evt);
            }
        });

        field1.setEditable(false);
        field1.setBackground(new java.awt.Color(255, 204, 204));
        field1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field1MouseClicked(evt);
            }
        });
        field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field1ActionPerformed(evt);
            }
        });

        field4.setEditable(false);
        field4.setBackground(new java.awt.Color(204, 255, 204));
        field4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field4MouseClicked(evt);
            }
        });
        field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field4ActionPerformed(evt);
            }
        });

        field5.setEditable(false);
        field5.setBackground(new java.awt.Color(204, 255, 204));
        field5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field5MouseClicked(evt);
            }
        });
        field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field5ActionPerformed(evt);
            }
        });

        field11.setEditable(false);
        field11.setBackground(new java.awt.Color(255, 204, 204));
        field11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field11MouseClicked(evt);
            }
        });
        field11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field11ActionPerformed(evt);
            }
        });

        field3.setEditable(false);
        field3.setBackground(new java.awt.Color(255, 204, 204));
        field3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field3MouseClicked(evt);
            }
        });
        field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field3ActionPerformed(evt);
            }
        });

        field6.setEditable(false);
        field6.setBackground(new java.awt.Color(204, 255, 204));
        field6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field6MouseClicked(evt);
            }
        });
        field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field6ActionPerformed(evt);
            }
        });

        field28.setEditable(false);
        field28.setBackground(new java.awt.Color(204, 255, 204));
        field28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field28MouseClicked(evt);
            }
        });
        field28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field28ActionPerformed(evt);
            }
        });

        field29.setEditable(false);
        field29.setBackground(new java.awt.Color(204, 255, 204));
        field29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field29MouseClicked(evt);
            }
        });
        field29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field29ActionPerformed(evt);
            }
        });

        field30.setEditable(false);
        field30.setBackground(new java.awt.Color(204, 255, 204));
        field30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field30MouseClicked(evt);
            }
        });
        field30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field30ActionPerformed(evt);
            }
        });

        field31.setEditable(false);
        field31.setBackground(new java.awt.Color(255, 204, 204));
        field31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field31MouseClicked(evt);
            }
        });
        field31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field31ActionPerformed(evt);
            }
        });

        field32.setEditable(false);
        field32.setBackground(new java.awt.Color(255, 204, 204));
        field32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field32MouseClicked(evt);
            }
        });
        field32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field32ActionPerformed(evt);
            }
        });

        field33.setEditable(false);
        field33.setBackground(new java.awt.Color(255, 204, 204));
        field33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field33MouseClicked(evt);
            }
        });
        field33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field33ActionPerformed(evt);
            }
        });

        field34.setEditable(false);
        field34.setBackground(new java.awt.Color(204, 255, 204));
        field34.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field34MouseClicked(evt);
            }
        });
        field34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field34ActionPerformed(evt);
            }
        });

        field36.setEditable(false);
        field36.setBackground(new java.awt.Color(204, 255, 204));
        field36.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field36MouseClicked(evt);
            }
        });
        field36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field36ActionPerformed(evt);
            }
        });

        field35.setEditable(false);
        field35.setBackground(new java.awt.Color(204, 255, 204));
        field35.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field35MouseClicked(evt);
            }
        });
        field35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field35ActionPerformed(evt);
            }
        });

        field37.setEditable(false);
        field37.setBackground(new java.awt.Color(204, 255, 204));
        field37.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field37MouseClicked(evt);
            }
        });
        field37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field37ActionPerformed(evt);
            }
        });

        field40.setEditable(false);
        field40.setBackground(new java.awt.Color(255, 204, 204));
        field40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field40MouseClicked(evt);
            }
        });
        field40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field40ActionPerformed(evt);
            }
        });

        field42.setEditable(false);
        field42.setBackground(new java.awt.Color(255, 204, 204));
        field42.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field42MouseClicked(evt);
            }
        });
        field42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field42ActionPerformed(evt);
            }
        });

        field38.setEditable(false);
        field38.setBackground(new java.awt.Color(204, 255, 204));
        field38.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field38MouseClicked(evt);
            }
        });
        field38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field38ActionPerformed(evt);
            }
        });

        field39.setEditable(false);
        field39.setBackground(new java.awt.Color(204, 255, 204));
        field39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field39MouseClicked(evt);
            }
        });
        field39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field39ActionPerformed(evt);
            }
        });

        field41.setEditable(false);
        field41.setBackground(new java.awt.Color(255, 204, 204));
        field41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field41MouseClicked(evt);
            }
        });
        field41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field41ActionPerformed(evt);
            }
        });

        field45.setEditable(false);
        field45.setBackground(new java.awt.Color(204, 255, 204));
        field45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field45MouseClicked(evt);
            }
        });
        field45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field45ActionPerformed(evt);
            }
        });

        field44.setEditable(false);
        field44.setBackground(new java.awt.Color(204, 255, 204));
        field44.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field44MouseClicked(evt);
            }
        });
        field44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field44ActionPerformed(evt);
            }
        });

        field43.setEditable(false);
        field43.setBackground(new java.awt.Color(204, 255, 204));
        field43.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field43MouseClicked(evt);
            }
        });
        field43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field43ActionPerformed(evt);
            }
        });

        field46.setEditable(false);
        field46.setBackground(new java.awt.Color(204, 255, 204));
        field46.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field46MouseClicked(evt);
            }
        });
        field46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field46ActionPerformed(evt);
            }
        });

        field47.setEditable(false);
        field47.setBackground(new java.awt.Color(204, 255, 204));
        field47.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field47MouseClicked(evt);
            }
        });
        field47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field47ActionPerformed(evt);
            }
        });

        field49.setEditable(false);
        field49.setBackground(new java.awt.Color(255, 204, 204));
        field49.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field49MouseClicked(evt);
            }
        });
        field49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field49ActionPerformed(evt);
            }
        });

        field50.setEditable(false);
        field50.setBackground(new java.awt.Color(255, 204, 204));
        field50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field50MouseClicked(evt);
            }
        });
        field50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field50ActionPerformed(evt);
            }
        });

        field51.setEditable(false);
        field51.setBackground(new java.awt.Color(255, 204, 204));
        field51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field51MouseClicked(evt);
            }
        });
        field51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field51ActionPerformed(evt);
            }
        });

        field48.setEditable(false);
        field48.setBackground(new java.awt.Color(204, 255, 204));
        field48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field48MouseClicked(evt);
            }
        });
        field48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field48ActionPerformed(evt);
            }
        });

        field52.setEditable(false);
        field52.setBackground(new java.awt.Color(204, 255, 204));
        field52.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field52MouseClicked(evt);
            }
        });
        field52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field52ActionPerformed(evt);
            }
        });

        field54.setEditable(false);
        field54.setBackground(new java.awt.Color(204, 255, 204));
        field54.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field54.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field54MouseClicked(evt);
            }
        });
        field54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field54ActionPerformed(evt);
            }
        });

        field55.setEditable(false);
        field55.setBackground(new java.awt.Color(255, 204, 204));
        field55.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field55.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field55MouseClicked(evt);
            }
        });
        field55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field55ActionPerformed(evt);
            }
        });

        field53.setEditable(false);
        field53.setBackground(new java.awt.Color(204, 255, 204));
        field53.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field53MouseClicked(evt);
            }
        });
        field53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field53ActionPerformed(evt);
            }
        });

        field57.setEditable(false);
        field57.setBackground(new java.awt.Color(255, 204, 204));
        field57.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field57.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field57MouseClicked(evt);
            }
        });
        field57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field57ActionPerformed(evt);
            }
        });

        field56.setEditable(false);
        field56.setBackground(new java.awt.Color(255, 204, 204));
        field56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field56.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field56MouseClicked(evt);
            }
        });
        field56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field56ActionPerformed(evt);
            }
        });

        field58.setEditable(false);
        field58.setBackground(new java.awt.Color(204, 255, 204));
        field58.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field58.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field58MouseClicked(evt);
            }
        });
        field58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field58ActionPerformed(evt);
            }
        });

        field63.setEditable(false);
        field63.setBackground(new java.awt.Color(255, 204, 204));
        field63.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field63.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field63MouseClicked(evt);
            }
        });
        field63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field63ActionPerformed(evt);
            }
        });

        field59.setEditable(false);
        field59.setBackground(new java.awt.Color(204, 255, 204));
        field59.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field59.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field59MouseClicked(evt);
            }
        });
        field59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field59ActionPerformed(evt);
            }
        });

        field60.setEditable(false);
        field60.setBackground(new java.awt.Color(204, 255, 204));
        field60.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field60.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field60MouseClicked(evt);
            }
        });
        field60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field60ActionPerformed(evt);
            }
        });

        field61.setEditable(false);
        field61.setBackground(new java.awt.Color(255, 204, 204));
        field61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field61.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field61MouseClicked(evt);
            }
        });
        field61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field61ActionPerformed(evt);
            }
        });

        field62.setEditable(false);
        field62.setBackground(new java.awt.Color(255, 204, 204));
        field62.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field62.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field62MouseClicked(evt);
            }
        });
        field62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field62ActionPerformed(evt);
            }
        });

        field65.setEditable(false);
        field65.setBackground(new java.awt.Color(255, 204, 204));
        field65.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field65.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field65MouseClicked(evt);
            }
        });
        field65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field65ActionPerformed(evt);
            }
        });

        field64.setEditable(false);
        field64.setBackground(new java.awt.Color(255, 204, 204));
        field64.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field64.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field64MouseClicked(evt);
            }
        });
        field64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field64ActionPerformed(evt);
            }
        });

        field66.setEditable(false);
        field66.setBackground(new java.awt.Color(255, 204, 204));
        field66.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field66.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field66MouseClicked(evt);
            }
        });
        field66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field66ActionPerformed(evt);
            }
        });

        field68.setEditable(false);
        field68.setBackground(new java.awt.Color(204, 255, 204));
        field68.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field68.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field68MouseClicked(evt);
            }
        });
        field68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field68ActionPerformed(evt);
            }
        });

        field67.setEditable(false);
        field67.setBackground(new java.awt.Color(204, 255, 204));
        field67.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field67.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field67MouseClicked(evt);
            }
        });
        field67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field67ActionPerformed(evt);
            }
        });

        field69.setEditable(false);
        field69.setBackground(new java.awt.Color(204, 255, 204));
        field69.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field69.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field69MouseClicked(evt);
            }
        });
        field69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field69ActionPerformed(evt);
            }
        });

        field70.setEditable(false);
        field70.setBackground(new java.awt.Color(255, 204, 204));
        field70.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field70.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field70MouseClicked(evt);
            }
        });
        field70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field70ActionPerformed(evt);
            }
        });

        field71.setEditable(false);
        field71.setBackground(new java.awt.Color(255, 204, 204));
        field71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field71.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field71MouseClicked(evt);
            }
        });
        field71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field71ActionPerformed(evt);
            }
        });

        field72.setEditable(false);
        field72.setBackground(new java.awt.Color(255, 204, 204));
        field72.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field72.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field72MouseClicked(evt);
            }
        });
        field72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field72ActionPerformed(evt);
            }
        });

        field75.setEditable(false);
        field75.setBackground(new java.awt.Color(255, 204, 204));
        field75.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field75.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field75MouseClicked(evt);
            }
        });
        field75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field75ActionPerformed(evt);
            }
        });

        field73.setEditable(false);
        field73.setBackground(new java.awt.Color(255, 204, 204));
        field73.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field73.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field73MouseClicked(evt);
            }
        });
        field73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field73ActionPerformed(evt);
            }
        });

        field74.setEditable(false);
        field74.setBackground(new java.awt.Color(255, 204, 204));
        field74.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field74.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field74MouseClicked(evt);
            }
        });
        field74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field74ActionPerformed(evt);
            }
        });

        field79.setEditable(false);
        field79.setBackground(new java.awt.Color(255, 204, 204));
        field79.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field79.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field79MouseClicked(evt);
            }
        });
        field79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field79ActionPerformed(evt);
            }
        });

        field77.setEditable(false);
        field77.setBackground(new java.awt.Color(204, 255, 204));
        field77.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field77.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field77MouseClicked(evt);
            }
        });
        field77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field77ActionPerformed(evt);
            }
        });

        field76.setEditable(false);
        field76.setBackground(new java.awt.Color(204, 255, 204));
        field76.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field76.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field76MouseClicked(evt);
            }
        });
        field76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field76ActionPerformed(evt);
            }
        });

        field78.setEditable(false);
        field78.setBackground(new java.awt.Color(204, 255, 204));
        field78.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field78.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field78MouseClicked(evt);
            }
        });
        field78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field78ActionPerformed(evt);
            }
        });

        field81.setEditable(false);
        field81.setBackground(new java.awt.Color(255, 204, 204));
        field81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field81.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field81MouseClicked(evt);
            }
        });
        field81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field81ActionPerformed(evt);
            }
        });

        field80.setEditable(false);
        field80.setBackground(new java.awt.Color(255, 204, 204));
        field80.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        field80.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                field80MouseClicked(evt);
            }
        });
        field80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field80ActionPerformed(evt);
            }
        });

        txaArchivo.setEditable(false);
        txaArchivo.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txaArchivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(field55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(field19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(field64, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(field44, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(field29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(field30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field56, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field47, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(field48, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(field39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field41, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field42, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field43, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field76, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field49, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field51, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field52, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field53, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(field67, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(field68, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(field58, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(field59, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(field60, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(field61, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(field62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(field78, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(field79, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(field69, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(field70, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(field71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(field80, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(field8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(field17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(field20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(field21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(field26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field45, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field54, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field63, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(field81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(field9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(btnSel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnSel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(140, 140, 140)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(field28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(field36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field50, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(field57, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field55, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field56, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field58, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field59, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field61, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field62, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(field63, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field66, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field65, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field64, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(field68, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field67, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field69, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field70, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field71, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(field72, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(field75, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(field73, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field74, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field76, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field77, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(field81, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field80, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field79, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(field78, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelActionPerformed
        JFileChooser fc = new JFileChooser();
        // declaro como nulo el cuadro de dialogo
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try {
            // lector de archivo del txt seleccionado
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            
            String texto="",
                   linea="";
            
            int contador = 0;
            
            while ((linea=br.readLine())!= null ) {
                // cada linea del texto la ire guardando en el texto con un salto de linea
                texto += linea+"\n";
                
                String[] values = linea.split(",");
                //recorremos el arrar de string
                for (int i = 0; i<values.length; i++) {
                    //obetengo el caracter de esa posicion y transformo a int
                    valor[contador][i] = Integer.parseInt(values[i]);
                }
                contador++;
            }
            
            jButton1.setEnabled(true);
            pintarTablero();
        } catch(Exception e){
        }
    }//GEN-LAST:event_btnSelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // llamo funcion para empezar con el algoritmo
        imprimirSudoku(valor);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void field14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field14ActionPerformed

    }//GEN-LAST:event_field14ActionPerformed

    private void field26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field26ActionPerformed

    private void field17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field17ActionPerformed

    private void field16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field16ActionPerformed

    private void field13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field13ActionPerformed

    private void field18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field18ActionPerformed

    private void field12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field12ActionPerformed

    private void field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field2ActionPerformed

    private void field10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field10ActionPerformed

    private void field19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field19ActionPerformed

    private void field24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field24ActionPerformed

    private void field23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field23ActionPerformed

    private void field25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field25ActionPerformed

    private void field27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field27ActionPerformed

    private void field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field9ActionPerformed

    private void field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field7ActionPerformed

    private void field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field8ActionPerformed

    private void field20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field20ActionPerformed

    private void field21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field21ActionPerformed

    private void field22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field22ActionPerformed

    private void field15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field15ActionPerformed

    private void field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field1ActionPerformed

    }//GEN-LAST:event_field1ActionPerformed

    private void field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field4ActionPerformed

    private void field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field5ActionPerformed

    private void field11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field11ActionPerformed

    private void field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field3ActionPerformed

    private void field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field6ActionPerformed

    private void field28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field28ActionPerformed

    private void field29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field29ActionPerformed

    private void field30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field30ActionPerformed

    private void field31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field31ActionPerformed

    private void field32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field32ActionPerformed

    private void field33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field33ActionPerformed

    private void field34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field34ActionPerformed

    private void field36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field36ActionPerformed

    private void field35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field35ActionPerformed

    private void field37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field37ActionPerformed

    private void field40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field40ActionPerformed

    private void field42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field42ActionPerformed

    private void field38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field38ActionPerformed

    private void field39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field39ActionPerformed

    private void field41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field41ActionPerformed

    private void field45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field45ActionPerformed

    private void field44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field44ActionPerformed

    private void field43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field43ActionPerformed

    private void field46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field46ActionPerformed

    private void field47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field47ActionPerformed

    private void field49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field49ActionPerformed

    private void field50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field50ActionPerformed

    private void field51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field51ActionPerformed

    private void field48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field48ActionPerformed

    private void field52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field52ActionPerformed

    private void field54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field54ActionPerformed

    private void field55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field55ActionPerformed

    private void field53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field53ActionPerformed

    private void field57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field57ActionPerformed

    private void field56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field56ActionPerformed

    private void field58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field58ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field58ActionPerformed

    private void field63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field63ActionPerformed

    private void field59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field59ActionPerformed

    private void field60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field60ActionPerformed

    private void field61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field61ActionPerformed

    private void field62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field62ActionPerformed

    private void field65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field65ActionPerformed

    private void field64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field64ActionPerformed

    private void field66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field66ActionPerformed

    private void field68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field68ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field68ActionPerformed

    private void field67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field67ActionPerformed

    private void field69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field69ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field69ActionPerformed

    private void field70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field70ActionPerformed

    private void field71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field71ActionPerformed

    private void field72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field72ActionPerformed

    private void field75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field75ActionPerformed

    private void field73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field73ActionPerformed

    private void field74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field74ActionPerformed

    private void field79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field79ActionPerformed

    private void field77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field77ActionPerformed

    private void field76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field76ActionPerformed

    private void field78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field78ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field78ActionPerformed

    private void field81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field81ActionPerformed

    private void field80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field80ActionPerformed

    private void field1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field1MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field1MouseClicked

    private void field2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field2MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field2MouseClicked

    private void field3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field3MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field3MouseClicked

    private void field4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field4MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field4MouseClicked

    private void field5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field5MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field5MouseClicked

    private void field6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field6MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field6MouseClicked

    private void field7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field7MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field7MouseClicked

    private void field8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field8MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field8MouseClicked

    private void field9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field9MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 0, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field9MouseClicked

    private void field10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field10MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field10MouseClicked

    private void field11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field11MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field11MouseClicked

    private void field12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field12MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field12MouseClicked

    private void field13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field13MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field13MouseClicked

    private void field14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field14MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field14MouseClicked

    private void field15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field15MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field15MouseClicked

    private void field16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field16MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field16MouseClicked

    private void field17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field17MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field17MouseClicked

    private void field18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field18MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 1, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field18MouseClicked

    private void field19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field19MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field19MouseClicked

    private void field20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field20MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field20MouseClicked

    private void field21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field21MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field21MouseClicked

    private void field22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field22MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field22MouseClicked

    private void field23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field23MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field23MouseClicked

    private void field24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field24MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field24MouseClicked

    private void field25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field25MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field25MouseClicked

    private void field26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field26MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field26MouseClicked

    private void field27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field27MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 2, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field27MouseClicked

    private void field28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field28MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field28MouseClicked

    private void field29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field29MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field29MouseClicked

    private void field30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field30MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field30MouseClicked

    private void field31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field31MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field31MouseClicked

    private void field32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field32MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field32MouseClicked

    private void field33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field33MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field33MouseClicked

    private void field34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field34MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field34MouseClicked

    private void field35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field35MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field35MouseClicked

    private void field36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field36MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 3, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field36MouseClicked

    private void field37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field37MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field37MouseClicked

    private void field38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field38MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field38MouseClicked

    private void field39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field39MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field39MouseClicked

    private void field40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field40MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field40MouseClicked

    private void field41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field41MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field41MouseClicked

    private void field42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field42MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field42MouseClicked

    private void field43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field43MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field43MouseClicked

    private void field44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field44MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field44MouseClicked

    private void field45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field45MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 4, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field45MouseClicked

    private void field46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field46MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field46MouseClicked

    private void field47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field47MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field47MouseClicked

    private void field48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field48MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field48MouseClicked

    private void field49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field49MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field49MouseClicked

    private void field50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field50MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field50MouseClicked

    private void field51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field51MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field51MouseClicked

    private void field52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field52MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field52MouseClicked

    private void field53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field53MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field53MouseClicked

    private void field54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field54MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 5, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field54MouseClicked

    private void field55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field55MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field55MouseClicked

    private void field56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field56MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field56MouseClicked

    private void field57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field57MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field57MouseClicked

    private void field58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field58MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field58MouseClicked

    private void field59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field59MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field59MouseClicked

    private void field60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field60MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field60MouseClicked

    private void field61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field61MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field61MouseClicked

    private void field62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field62MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field62MouseClicked

    private void field63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field63MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 6, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field63MouseClicked

    private void field64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field64MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field64MouseClicked

    private void field65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field65MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field65MouseClicked

    private void field66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field66MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field66MouseClicked

    private void field67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field67MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field67MouseClicked

    private void field68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field68MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field68MouseClicked

    private void field69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field69MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field69MouseClicked

    private void field70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field70MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field70MouseClicked

    private void field71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field71MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field71MouseClicked

    private void field72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field72MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 7, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field72MouseClicked

    private void field73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field73MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 0))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field73MouseClicked

    private void field74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field74MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 1))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field74MouseClicked

    private void field75MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field75MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 2))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field75MouseClicked

    private void field76MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field76MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 3))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field76MouseClicked

    private void field77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field77MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 4))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field77MouseClicked

    private void field78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field78MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 5))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field78MouseClicked

    private void field79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field79MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 6))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field79MouseClicked

    private void field80MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field80MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 7))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field80MouseClicked

    private void field81MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_field81MouseClicked
        ArrayList listaNumeros = new ArrayList();
        for (int i = 1; i <= filas; i++) {
            if(verifacionCelda(valor, i, 8, 8))
                listaNumeros.add(i);
        }
        txaArchivo.setText(listaNumeros.toString());
    }//GEN-LAST:event_field81MouseClicked

    public void imprimirSudoku(int [][]valor){
        if(resolver(valor) ==  true){
            pintarTablero();
        } 
    }
    
    public void pintarTablero() {
        field1.setText(Integer.toString(valor[0][0]));
        field2.setText(Integer.toString(valor[0][1]));
        field3.setText(Integer.toString(valor[0][2]));
        field4.setText(Integer.toString(valor[0][3]));
        field5.setText(Integer.toString(valor[0][4]));
        field6.setText(Integer.toString(valor[0][5]));
        field7.setText(Integer.toString(valor[0][6]));
        field8.setText(Integer.toString(valor[0][7]));
        field9.setText(Integer.toString(valor[0][8]));

        field10.setText(Integer.toString(valor[1][0]));
        field11.setText(Integer.toString(valor[1][1]));
        field12.setText(Integer.toString(valor[1][2]));
        field13.setText(Integer.toString(valor[1][3]));
        field14.setText(Integer.toString(valor[1][4]));
        field15.setText(Integer.toString(valor[1][5]));
        field16.setText(Integer.toString(valor[1][6]));
        field17.setText(Integer.toString(valor[1][7]));
        field18.setText(Integer.toString(valor[1][8]));

        field19.setText(Integer.toString(valor[2][0]));
        field20.setText(Integer.toString(valor[2][1]));
        field21.setText(Integer.toString(valor[2][2]));
        field22.setText(Integer.toString(valor[2][3]));
        field23.setText(Integer.toString(valor[2][4]));
        field24.setText(Integer.toString(valor[2][5]));
        field25.setText(Integer.toString(valor[2][6]));
        field26.setText(Integer.toString(valor[2][7]));
        field27.setText(Integer.toString(valor[2][8]));

        field28.setText(Integer.toString(valor[3][0]));
        field29.setText(Integer.toString(valor[3][1]));
        field30.setText(Integer.toString(valor[3][2]));
        field31.setText(Integer.toString(valor[3][3]));
        field32.setText(Integer.toString(valor[3][4]));
        field33.setText(Integer.toString(valor[3][5]));
        field34.setText(Integer.toString(valor[3][6]));
        field35.setText(Integer.toString(valor[3][7]));
        field36.setText(Integer.toString(valor[3][8]));

        field37.setText(Integer.toString(valor[4][0]));
        field38.setText(Integer.toString(valor[4][1]));
        field39.setText(Integer.toString(valor[4][2]));
        field40.setText(Integer.toString(valor[4][3]));
        field41.setText(Integer.toString(valor[4][4]));
        field42.setText(Integer.toString(valor[4][5]));
        field43.setText(Integer.toString(valor[4][6]));
        field44.setText(Integer.toString(valor[4][7]));
        field45.setText(Integer.toString(valor[4][8]));

        field46.setText(Integer.toString(valor[5][0]));
        field47.setText(Integer.toString(valor[5][1]));
        field48.setText(Integer.toString(valor[5][2]));
        field49.setText(Integer.toString(valor[5][3]));
        field50.setText(Integer.toString(valor[5][4]));
        field51.setText(Integer.toString(valor[5][5]));
        field52.setText(Integer.toString(valor[5][6]));
        field53.setText(Integer.toString(valor[5][7]));
        field54.setText(Integer.toString(valor[5][8]));

        field55.setText(Integer.toString(valor[6][0]));
        field56.setText(Integer.toString(valor[6][1]));
        field57.setText(Integer.toString(valor[6][2]));
        field58.setText(Integer.toString(valor[6][3]));
        field59.setText(Integer.toString(valor[6][4]));
        field60.setText(Integer.toString(valor[6][5]));
        field61.setText(Integer.toString(valor[6][6]));
        field62.setText(Integer.toString(valor[6][7]));
        field63.setText(Integer.toString(valor[6][8]));

        field64.setText(Integer.toString(valor[7][0]));
        field65.setText(Integer.toString(valor[7][1]));
        field66.setText(Integer.toString(valor[7][2]));
        field67.setText(Integer.toString(valor[7][3]));
        field68.setText(Integer.toString(valor[7][4]));
        field69.setText(Integer.toString(valor[7][5]));
        field70.setText(Integer.toString(valor[7][6]));
        field71.setText(Integer.toString(valor[7][7]));
        field72.setText(Integer.toString(valor[7][8]));

        field73.setText(Integer.toString(valor[8][0]));
        field74.setText(Integer.toString(valor[8][1]));
        field75.setText(Integer.toString(valor[8][2]));
        field76.setText(Integer.toString(valor[8][3]));
        field77.setText(Integer.toString(valor[8][4]));
        field78.setText(Integer.toString(valor[8][5]));
        field79.setText(Integer.toString(valor[8][6]));
        field80.setText(Integer.toString(valor[8][7]));
        field81.setText(Integer.toString(valor[8][8]));
    }
   
    public boolean resolver(int [][]sudokuMatriz){
        int indiceFila = -1, // -1 para determinar simplemente un numero que no afecte en los recorridos
                // y que pueda determinar si existe una posicion
            indiceColumna = -1;
        
        int i = 0; // seran los que me ayuden a iterar
        int j = 0;
        
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if(sudokuMatriz[i][j] == 0){ // si no existen pistas en este campo
                    // si encontramos un cero significa que debemos buscar un numero
                    indiceFila = i; //guardo las posiciones de este valor
                    indiceColumna = j;
                    break;
                }
            }
            if(indiceFila != -1) break; // salgo del ciclo
        }
        
        if (i == 9 && j == 9){ //si ya recorrimos toda la matriz encontrando una solucion reemplazando los 0
            return  true;
        } else {
            //determinamos que numero asignar
            for (int valor = 1; valor <= 9; valor++) { // numeros de 1 hasta 9
                // con esta funcion valido si el numero a asignar a la celda es seguro para colocarlo
                if(verifacionCelda(sudokuMatriz, valor, indiceFila, indiceColumna)){
                    
                    //si se comprobo que es seguro de mantener este valor lo asigno a mi matriz
                    sudokuMatriz[indiceFila][indiceColumna] = valor;
                    
                    /*
                        hago recursividad de la funcion volviendo a enviar la matriz nueva con el valor asignado
                        y continuar con el valor de la derecha o el que le sigue
                    */
                    if(!resolver(sudokuMatriz)) 
                        /*
                            si no esta resuelta a un la matriz elimino el valor asignado 
                            con un 0 para volver a intentarlo, es ddecir hago un retroceso
                            de ese valor para intentar con otro hasta que este pueda
                            seguir avanzando
                        */
                        sudokuMatriz[indiceFila][indiceColumna] = 0;
                    else 
                        /* 
                            si no tengo problemas con el numero asignado en la posicion termine la asignacion
                            y obtuve una solucion
                        */
                        return true;
                }
            }
            return false;
        }
    }
    
    public static boolean verifacionCelda(int [][] sudokuMatriz, int valorAprobar, int indiceFila, int indiceColumna){
        // Este ciclo valida que no exista el mismo numero en la fila, movimiento a la derecha
        for (int j = 0; j < 9; j++) {
            // recorro la matriz teniendo presenta la fila donde esta ese valor como referencia
            if(sudokuMatriz[indiceFila][j] == valorAprobar){
                
                return  false; // si se encuentra el mismo valor vuelvo a intentar asignando otro valor
            }
        }
        
        // Este ciclo valida que no exista el mismo numero en la columnam, movimiento hacia abajo
        for (int i = 0; i < 9; i++) {
            if(sudokuMatriz[i][indiceColumna] == valorAprobar){
                return  false; // si se encuentra el mismo valor vuelvo a intentar asignando otro valor
            }
        }
        
        // valido que no exista el mismo numero en su cuadriculo 3x3
        int baseIndiceFila = indiceFila - (indiceFila % 3);
        /*
            Encuentro el indice de la primera fila y la primera columna, desde donde inicia
            para poder recorrer desde ese punto y tomar el 3x3
        */
        int baseIndiceColumna = indiceColumna - (indiceColumna % 3);
        
        for (int i = baseIndiceFila; i < baseIndiceFila + 3; i++) { // las 3 siguientes casillas a este punto
            for (int j = baseIndiceColumna; j < baseIndiceColumna + 3; j++) {
                if(sudokuMatriz[i][j] == valorAprobar)
                    return  false; // si se encuentra el mismo valor vuelvo a intentar asignando otro valor
            }
        }
        //si no se repite este numero en la fila, columna, y cuadricula retorno
        return true;
    }
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSel;
    private javax.swing.JTextField field1;
    private javax.swing.JTextField field10;
    private javax.swing.JTextField field11;
    private javax.swing.JTextField field12;
    private javax.swing.JTextField field13;
    private javax.swing.JTextField field14;
    private javax.swing.JTextField field15;
    private javax.swing.JTextField field16;
    private javax.swing.JTextField field17;
    private javax.swing.JTextField field18;
    private javax.swing.JTextField field19;
    private javax.swing.JTextField field2;
    private javax.swing.JTextField field20;
    private javax.swing.JTextField field21;
    private javax.swing.JTextField field22;
    private javax.swing.JTextField field23;
    private javax.swing.JTextField field24;
    private javax.swing.JTextField field25;
    private javax.swing.JTextField field26;
    private javax.swing.JTextField field27;
    private javax.swing.JTextField field28;
    private javax.swing.JTextField field29;
    private javax.swing.JTextField field3;
    private javax.swing.JTextField field30;
    private javax.swing.JTextField field31;
    private javax.swing.JTextField field32;
    private javax.swing.JTextField field33;
    private javax.swing.JTextField field34;
    private javax.swing.JTextField field35;
    private javax.swing.JTextField field36;
    private javax.swing.JTextField field37;
    private javax.swing.JTextField field38;
    private javax.swing.JTextField field39;
    private javax.swing.JTextField field4;
    private javax.swing.JTextField field40;
    private javax.swing.JTextField field41;
    private javax.swing.JTextField field42;
    private javax.swing.JTextField field43;
    private javax.swing.JTextField field44;
    private javax.swing.JTextField field45;
    private javax.swing.JTextField field46;
    private javax.swing.JTextField field47;
    private javax.swing.JTextField field48;
    private javax.swing.JTextField field49;
    private javax.swing.JTextField field5;
    private javax.swing.JTextField field50;
    private javax.swing.JTextField field51;
    private javax.swing.JTextField field52;
    private javax.swing.JTextField field53;
    private javax.swing.JTextField field54;
    private javax.swing.JTextField field55;
    private javax.swing.JTextField field56;
    private javax.swing.JTextField field57;
    private javax.swing.JTextField field58;
    private javax.swing.JTextField field59;
    private javax.swing.JTextField field6;
    private javax.swing.JTextField field60;
    private javax.swing.JTextField field61;
    private javax.swing.JTextField field62;
    private javax.swing.JTextField field63;
    private javax.swing.JTextField field64;
    private javax.swing.JTextField field65;
    private javax.swing.JTextField field66;
    private javax.swing.JTextField field67;
    private javax.swing.JTextField field68;
    private javax.swing.JTextField field69;
    private javax.swing.JTextField field7;
    private javax.swing.JTextField field70;
    private javax.swing.JTextField field71;
    private javax.swing.JTextField field72;
    private javax.swing.JTextField field73;
    private javax.swing.JTextField field74;
    private javax.swing.JTextField field75;
    private javax.swing.JTextField field76;
    private javax.swing.JTextField field77;
    private javax.swing.JTextField field78;
    private javax.swing.JTextField field79;
    private javax.swing.JTextField field8;
    private javax.swing.JTextField field80;
    private javax.swing.JTextField field81;
    private javax.swing.JTextField field9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField txaArchivo;
    // End of variables declaration//GEN-END:variables
}
