	package br.com.fiap.Jogo;
	
	public interface Visualizavel {
	
		
		
		
		
		default void mover(int x, int y) {
	        setX(x);
	        setY(y);
	    }

		void setX(int x);

		void setY(int y);

		String gety();

		int getX();
		
	
	}		
