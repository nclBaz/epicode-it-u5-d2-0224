package riccardogulin.u5d2.dao;

import org.springframework.stereotype.Component;

@Component
public class StudentsDAO {
	public void save() {
		System.out.println("Utente salvato");
	}

	public void findById() {
		System.out.println("Ecco il tuo utente");
	}
}
