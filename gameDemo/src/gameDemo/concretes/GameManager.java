package gameDemo.concretes;

import gameDemo.abstracts.GameService;
import gameDemo.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game successfully added.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game successfully deleted.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game successfully updated.");
		
	}

}
