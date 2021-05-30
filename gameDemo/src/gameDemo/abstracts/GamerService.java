package gameDemo.abstracts;

import gameDemo.entities.Gamer;

public interface GamerService {
void register(Gamer gamer);
void delete(Gamer gamer);
void update(Gamer gamer);

}
