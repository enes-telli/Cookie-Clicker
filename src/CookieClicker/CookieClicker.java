package CookieClicker;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class CookieClicker extends javax.swing.JFrame {

    int cookie = 1110;
    double perSec = 0;
    int efficiency = 1;
    
    int timerSpeed = 1000;
    Timer timer;
    boolean timerOn = false;
    
    final double priceMultiplier = 0.15;
    
    Building cursor;
    Building grandma;
    Building farm;
    Building mine;

    List<Upgrade> allUpgrades = new ArrayList<>();
    List<Upgrade> currentUpgrades = new ArrayList<>();
    
    JLabel[] upgradeLabels = new JLabel[4];
    JLabel[] upgradePrices = new JLabel[4];
    
    public void setTimer() {
        timer = new Timer(timerSpeed, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cookie++;
                jLabel1.setText(cookie + " Cookies");
                enableButtons();
            }
        });
    }

    public void enableButtons() {
        if (cookie >= cursor.price) {
            cursorButton.setEnabled(true);
        }
        if (cookie >= grandma.price) {
            grandmaButton.setEnabled(true);
        }
        if (cookie >= farm.price) {
            farmButton.setEnabled(true);
        }
        if (cookie >= mine.price) {
            mineButton.setEnabled(true);
        }
    }

    public void disableButtons() {
        if (cookie < cursor.price) {
            cursorButton.setEnabled(false);
        }
        if (cookie < grandma.price) {
            grandmaButton.setEnabled(false);
        }
        if (cookie < farm.price) {
            farmButton.setEnabled(false);
        }
        if (cookie < mine.price) {
            mineButton.setEnabled(false);
        }
    }

    public void timerUpdate() {
        if (timerOn == false) {
            timerOn = true;
        } else if (timerOn == true) {
            timer.stop();
        }

        timerSpeed = (int) Math.round(1 / perSec * 1000);

        String CPS = String.format("%.1f", perSec);
        jLabel3.setText(CPS + " CpS");

        setTimer();
        timer.start();
    }

    public CookieClicker() {
        initComponents();
        
        upgradeLabels[0] = upgradeLabel1;
        upgradeLabels[1] = upgradeLabel2;
        upgradeLabels[2] = upgradeLabel3;
        upgradeLabels[3] = upgradeLabel4;
        
        upgradePrices[0] = upgradePrice1;
        upgradePrices[1] = upgradePrice2;
        upgradePrices[2] = upgradePrice3;
        upgradePrices[3] = upgradePrice4;
        
        cursor = new Building(15, 0.2, cursorButton, cursorOwned);
        grandma = new Building(100, 2, grandmaButton, grandmaOwned);
        farm = new Building(1100, 16, farmButton, farmOwned);
        mine = new Building(12000, 94, mineButton, mineOwned);
        
        allUpgrades.add(new Upgrade(100, 1, new ImageIcon(getClass().getResource("/images/48cursor1.png"))));
        allUpgrades.add(new Upgrade(500, 1, new ImageIcon(getClass().getResource("/images/48cursor2.png"))));
        allUpgrades.add(new Upgrade(10000, 10, new ImageIcon(getClass().getResource("/images/48cursor3.png"))));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CookieLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cursorLabel = new javax.swing.JLabel();
        grandmaLabel = new javax.swing.JLabel();
        farmLabel = new javax.swing.JLabel();
        mineLabel = new javax.swing.JLabel();
        cursorButton = new javax.swing.JButton();
        grandmaButton = new javax.swing.JButton();
        farmButton = new javax.swing.JButton();
        mineButton = new javax.swing.JButton();
        cursorOwned = new javax.swing.JLabel();
        grandmaOwned = new javax.swing.JLabel();
        farmOwned = new javax.swing.JLabel();
        mineOwned = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        upgradeLabel1 = new javax.swing.JLabel();
        upgradeLabel2 = new javax.swing.JLabel();
        upgradeLabel3 = new javax.swing.JLabel();
        upgradeLabel4 = new javax.swing.JLabel();
        upgradePrice1 = new javax.swing.JLabel();
        upgradePrice2 = new javax.swing.JLabel();
        upgradePrice3 = new javax.swing.JLabel();
        upgradePrice4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cookie Clicker [Beta]");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("0 Cookies");

        jLabel3.setText("0.0 CpS");

        CookieLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/96.png"))); // NOI18N
        CookieLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CookieLabelMouseClicked(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(480, 240));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cursor32.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grandma32.png"))); // NOI18N
        jLabel12.setText("jLabel9");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/farm32.png"))); // NOI18N
        jLabel13.setText("jLabel9");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mine32.png"))); // NOI18N
        jLabel14.setText("jLabel9");

        cursorLabel.setText("[Cursor] 0.2 CpS");

        grandmaLabel.setText("[GrandMa] 2 CpS");

        farmLabel.setText("[Farm] 16 CpS");

        mineLabel.setText("[Mine] 94 CpS");

        cursorButton.setText("15 Cookies");
        cursorButton.setEnabled(false);
        cursorButton.setPreferredSize(new java.awt.Dimension(100, 25));
        cursorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cursorButtonMouseClicked(evt);
            }
        });

        grandmaButton.setText("100 Cookies");
        grandmaButton.setEnabled(false);
        grandmaButton.setPreferredSize(new java.awt.Dimension(100, 25));
        grandmaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grandmaButtonMouseClicked(evt);
            }
        });

        farmButton.setText("1100 Cookies");
        farmButton.setEnabled(false);
        farmButton.setPreferredSize(new java.awt.Dimension(100, 25));
        farmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                farmButtonMouseClicked(evt);
            }
        });

        mineButton.setText("12000 Cookies");
        mineButton.setEnabled(false);
        mineButton.setPreferredSize(new java.awt.Dimension(100, 25));
        mineButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mineButtonMouseClicked(evt);
            }
        });

        cursorOwned.setText("[Owned: 0]");

        grandmaOwned.setText("[Owned: 0]");

        farmOwned.setText("[Owned: 0]");

        mineOwned.setText("[Owned: 0]");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buildings");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mineLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(farmLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grandmaLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cursorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cursorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(grandmaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(farmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cursorOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grandmaOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(farmOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mineOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cursorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cursorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cursorOwned, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grandmaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(grandmaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(grandmaOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(farmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(farmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(farmOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mineOwned, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(480, 240));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Upgrades");
        jLabel4.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(220, 220, 220));
        jPanel3.setPreferredSize(new java.awt.Dimension(48, 222));

        upgradeLabel1.setPreferredSize(new java.awt.Dimension(48, 48));
        upgradeLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upgradeLabel1MouseClicked(evt);
            }
        });

        upgradeLabel2.setPreferredSize(new java.awt.Dimension(48, 48));
        upgradeLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upgradeLabel2MouseClicked(evt);
            }
        });

        upgradeLabel3.setPreferredSize(new java.awt.Dimension(48, 48));
        upgradeLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upgradeLabel3MouseClicked(evt);
            }
        });

        upgradeLabel4.setPreferredSize(new java.awt.Dimension(48, 48));
        upgradeLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upgradeLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upgradeLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upgradeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upgradeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upgradeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(upgradeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upgradeLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(upgradeLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upgradeLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        upgradePrice1.setText("Price: 100 Cookies");
        upgradePrice1.setMaximumSize(new java.awt.Dimension(144, 48));
        upgradePrice1.setMinimumSize(new java.awt.Dimension(144, 48));
        upgradePrice1.setPreferredSize(new java.awt.Dimension(144, 48));

        upgradePrice2.setText("Price: 100 Cookies");
        upgradePrice2.setMaximumSize(new java.awt.Dimension(144, 48));
        upgradePrice2.setMinimumSize(new java.awt.Dimension(144, 48));
        upgradePrice2.setPreferredSize(new java.awt.Dimension(144, 48));

        upgradePrice3.setText("Price: 100 Cookies");
        upgradePrice3.setMaximumSize(new java.awt.Dimension(144, 48));
        upgradePrice3.setMinimumSize(new java.awt.Dimension(144, 48));
        upgradePrice3.setPreferredSize(new java.awt.Dimension(144, 48));

        upgradePrice4.setText("Price: 100 Cookies");
        upgradePrice4.setMaximumSize(new java.awt.Dimension(144, 48));
        upgradePrice4.setMinimumSize(new java.awt.Dimension(144, 48));
        upgradePrice4.setPreferredSize(new java.awt.Dimension(144, 48));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upgradePrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradePrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradePrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upgradePrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(upgradePrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upgradePrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upgradePrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upgradePrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(CookieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(CookieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cursorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursorButtonMouseClicked
        BuildingButtonClicked(cursor);
    }//GEN-LAST:event_cursorButtonMouseClicked

    private void grandmaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grandmaButtonMouseClicked
        BuildingButtonClicked(grandma);
    }//GEN-LAST:event_grandmaButtonMouseClicked

    private void farmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_farmButtonMouseClicked
        BuildingButtonClicked(farm);
    }//GEN-LAST:event_farmButtonMouseClicked

    private void mineButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mineButtonMouseClicked
        BuildingButtonClicked(mine);
    }//GEN-LAST:event_mineButtonMouseClicked

    private void CookieLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CookieLabelMouseClicked
        cookie += efficiency;
        jLabel1.setText(cookie + " Cookies");
        enableButtons();
    }//GEN-LAST:event_CookieLabelMouseClicked

    private void upgradeLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upgradeLabel1MouseClicked
        UpgradeButtonClicked(0);
    }//GEN-LAST:event_upgradeLabel1MouseClicked

    private void upgradeLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upgradeLabel2MouseClicked
        UpgradeButtonClicked(1);
    }//GEN-LAST:event_upgradeLabel2MouseClicked

    private void upgradeLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upgradeLabel3MouseClicked
        UpgradeButtonClicked(2);
    }//GEN-LAST:event_upgradeLabel3MouseClicked

    private void upgradeLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upgradeLabel4MouseClicked
        UpgradeButtonClicked(3);
    }//GEN-LAST:event_upgradeLabel4MouseClicked

    private void BuildingButtonClicked(Building building)
    {
        if (cookie >= building.price) {
            cookie -= building.price;
            jLabel1.setText(cookie + " Cookies");

            building.price += (int) (building.price * priceMultiplier);
            building.button.setText(building.price + " Cookies");

            building.label.setText("[Owned: " + (++building.count) + "]");

            disableButtons();
            perSec += building.cps;
            timerUpdate();
            
            CheckForUpgrades(building);
            
            UpdateLabels();
        }
    }
    
    private void UpgradeButtonClicked(int upgradeCount)
    {
        if (currentUpgrades.size() > upgradeCount)
        {
            Upgrade upgrade = currentUpgrades.get(upgradeCount);
            
            if (cookie >= upgrade.price)
            {
                cookie -= upgrade.price;
                jLabel1.setText(cookie + " Cookies");
                efficiency *= 2;
                
                currentUpgrades.remove(upgrade);
                
                UpdateLabels();
            }   
        }
        
    }
    
    private void CheckForUpgrades(Building building)
    {
        List<Upgrade> deletedList = new ArrayList<>();
        
        for(Upgrade upgrade : allUpgrades)
        {
            if (building.count >= upgrade.requiredCount && upgrade.locked)
            {
                upgrade.locked = false;
                currentUpgrades.add(upgrade);
                deletedList.add(upgrade);
            }
        }
        
        for(Upgrade upgrade : deletedList)
        {
            allUpgrades.remove(upgrade);
        }
    }
    
    private void UpdateLabels()
    {
        int min = (currentUpgrades.size() < upgradeLabels.length) ? currentUpgrades.size() : upgradeLabels.length;
        
        for (int i = 0; i < min; i++)
        {
            upgradeLabels[i].setIcon(currentUpgrades.get(i).icon);
            upgradePrices[i].setText("Price: " + currentUpgrades.get(i).price + " Cookies");
        }
        
        for (int i = min; i < upgradeLabels.length; i++)
        {
            upgradeLabels[i].setIcon(null);
            upgradePrices[i].setText("");
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CookieClicker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CookieLabel;
    private javax.swing.JButton cursorButton;
    private javax.swing.JLabel cursorLabel;
    private javax.swing.JLabel cursorOwned;
    private javax.swing.JButton farmButton;
    private javax.swing.JLabel farmLabel;
    private javax.swing.JLabel farmOwned;
    private javax.swing.JButton grandmaButton;
    private javax.swing.JLabel grandmaLabel;
    private javax.swing.JLabel grandmaOwned;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton mineButton;
    private javax.swing.JLabel mineLabel;
    private javax.swing.JLabel mineOwned;
    private javax.swing.JLabel upgradeLabel1;
    private javax.swing.JLabel upgradeLabel2;
    private javax.swing.JLabel upgradeLabel3;
    private javax.swing.JLabel upgradeLabel4;
    private javax.swing.JLabel upgradePrice1;
    private javax.swing.JLabel upgradePrice2;
    private javax.swing.JLabel upgradePrice3;
    private javax.swing.JLabel upgradePrice4;
    // End of variables declaration//GEN-END:variables
}
