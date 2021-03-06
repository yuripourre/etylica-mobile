package br.com.etyllica.gui.label;

import br.com.etyllica.layer.Layer;

public class Label extends Layer {

	protected int bx;
	protected int by;
	protected int bw;
	protected int bh;
	
	public Label(int x, int y) {
		this(x, y, 0, 0);
	}
	
	public Label(int x, int y, int w) {
		this(x, y, w, 0);
	}
	
	public Label(int x, int y, int w, int h) {
		super(x, y, w, h);
		setContentBounds(x, y, w, h);
	}

	public void setContentBounds(int bx, int by, int bw, int bh){
		this.bx = bx;
		this.by = by;
		this.bw = bw;
		this.bh = bh;
	}
	
}
