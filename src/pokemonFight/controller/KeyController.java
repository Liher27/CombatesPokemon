package pokemonFight.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import pokemonFight.manager.StatusSingleton;

public class KeyController implements KeyListener {
	/**
	 * Clase utilizada para recibir la informacion que se le pasa por teclado
	 */
	@Override
	public void keyTyped(KeyEvent e) {
	}

	/**
	 * Metodo implementado por "KeyListener", sirve para indicar que deberia de
	 * hacerse cuando una tecla es pulsada
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();

		if (code == KeyEvent.VK_P) {
			StatusSingleton.getInstance().getSongController().stop();
		}
		if (code == KeyEvent.VK_R) {
			StatusSingleton.getInstance().getSongController().play();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
