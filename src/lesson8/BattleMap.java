package lesson8;

import javafx.print.Printer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;
    private int fieldSize;
    private int winLength;

    private boolean isInit;

    private int cellWidth;
    private int cellHeigth;


    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.orange);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int cellX = e.getX() / cellWidth;
                int cellY = e.getY() / cellWidth;

                if (isInit && !Logic.isGameFinished) {
                    Logic.humanTurn(cellY, cellX);

                }
                repaint();
            }
        });
    }

    void stratNewGame(int fieldSize, int winLength) {
        this.fieldSize = fieldSize;
        this.winLength = winLength;

        isInit = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (!isInit) {
            return;
        }
        int panelWidth = getWidth();
        int panelHeigth = getHeight();

        cellWidth = panelWidth / fieldSize;
        cellHeigth = panelHeigth / fieldSize;

        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(2f));

        for (int i = 1; i < fieldSize; i++) {
            int y = i * cellHeigth;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 1; i < fieldSize; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeigth);
        }

        drawXO(g);
    }

    private void drawX(Graphics g, int y, int x) {
        g.setColor(Color.BLUE);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        g.drawLine(x * cellWidth, y * cellHeigth, (x + 1) * cellWidth, (y + 1) * cellHeigth);
        g.drawLine(x * cellWidth, (y + 1) * cellHeigth, (x + 1) * cellWidth, y * cellHeigth);

    }

    private void drawO(Graphics g, int y, int x) {
        g.setColor(Color.red);
        ((Graphics2D) g).setStroke(new BasicStroke(3f));
        g.drawOval(x * cellWidth, y * cellHeigth, cellWidth, cellHeigth);
    }

    void drawXO(Graphics g) {
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (Logic.map[i][j] == Logic.DOT_X) {
                    drawX(g, i, j);
                } else if (Logic.map[i][j] == Logic.DOT_O) {
                    drawO(g, i, j);
                }
            }
        }
    }
}
