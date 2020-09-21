package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Match extends JFrame {
	private String winnerName;
	private int milanScored;
	private int madridScored;
	JButton milan = new JButton("AC Milan");
	JButton madrid = new JButton("Real Madrid");
	JLabel result = new JLabel("Result: 0 X 0");
	JLabel lastScorer = new JLabel("Last Scorer: N/A");
	JLabel winner = new JLabel("Winner: DRAW");
	JPanel pnl = new JPanel();


	Match() {
		super("Football Match");
		setLayout(new BorderLayout());
		setSize(400, 100);
		setResizable(false);
		add(milan, BorderLayout.WEST);
		add(madrid, BorderLayout.EAST);
		add(pnl, BorderLayout.CENTER);
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(result);
		pnl.add(lastScorer);
		pnl.add(winner);
		milan.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent mouseEvent) { }
			@Override
			public void mousePressed(MouseEvent mouseEvent) { }
			@Override
			public void mouseReleased(MouseEvent mouseEvent) {
				++milanScored;
				lastScorer.setText("Last Scorer: AC Milan");
				result.setText("Result: " + Integer.toString(milanScored) + " X " + Integer.toString(madridScored));
				if (madridScored > milanScored) {
					winnerName = "Real Madrid";
				} else if (madridScored < milanScored) {
					winnerName = "AC Milan";
				} else {
					winnerName = "DRAW";
				}
				winner.setText("Winner: " + winnerName);
			}
			@Override
			public void mouseEntered(MouseEvent mouseEvent) { }
			@Override
			public void mouseExited(MouseEvent mouseEvent) { }
		});

		madrid.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent mouseEvent) {

			}
			@Override
			public void mousePressed(MouseEvent mouseEvent) { }
			@Override
			public void mouseReleased(MouseEvent mouseEvent) {
				++madridScored;
				lastScorer.setText("Last Scorer: Real Madrid");
				result.setText("Result: " + Integer.toString(milanScored) + " X " + Integer.toString(madridScored));
				if (madridScored > milanScored) {
					winnerName = "Real Madrid";
				} else if (madridScored < milanScored) {
					winnerName = "AC Milan";
				} else {
					winnerName = "DRAW";
				}
				winner.setText("Winner: " + winnerName);
			}
			@Override
			public void mouseEntered(MouseEvent mouseEvent) { }
			@Override
			public void mouseExited(MouseEvent mouseEvent) { }
		});

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Match();
	}
}