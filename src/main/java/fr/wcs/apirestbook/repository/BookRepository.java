package fr.wcs.apirestbook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.wcs.apirestbook.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	List<Book> findByTitleContainingOrAuthorOrDescriptionContaining(String text, String textAgain,
			String textAgainAgain);
}
