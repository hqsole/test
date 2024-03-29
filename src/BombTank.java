import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class BombTank {
	private int x, y;
	private boolean live = true; // ��ʼ״̬Ϊ���ŵ�
	private TankClient tc;
	private static Toolkit tk = Toolkit.getDefaultToolkit();

	private static Image[] imgs = { // �洢��ըͼƬ ��С����ı�ըЧ��ͼ
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/1.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/2.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/3.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/4.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/5.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/6.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/7.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/8.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/9.gif")),
			tk.getImage(BombTank.class.getClassLoader().getResource(
					"images/10.gif")), };
	int step = 0;

	public BombTank(int x, int y, TankClient tc) { // ���캯��
		this.x = x;
		this.y = y;
		this.tc = tc;
	}
	public void draw(Graphics g) { // ������ըͼ��

		if (!live) { // ̹����ʧ��ɾ����ըͼ
			tc.bombTanks.remove(this);
			return;
		}
		if (step == imgs.length) {
			live = false;
			step = 0;
			return;
		}

		g.drawImage(imgs[step], x, y, null);
		step++;
	}
}
