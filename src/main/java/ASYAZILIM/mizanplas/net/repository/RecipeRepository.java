package ASYAZILIM.mizanplas.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ASYAZILIM.mizanplas.net.entities.concretes.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
