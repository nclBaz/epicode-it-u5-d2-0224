package riccardogulin.u5d2.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Interviewer {
	// FIELD INJECTION
	// Se non uso il constructor posso mettere @Autowired direttamente sugli attributi e Spring cercherà
	// autonomamente le dipendenze necessarie. Se non mettessi @Autowired in tal caso student sarebbe null
	/*	@Autowired*/
	private IStudent student;
	private String name;
	private String surname;

/*	public Interviewer() {
		this.student = new BackendStudent("Aldo"); // <-- ACCOPPIAMENTO FORTE, NON LO VOGLIAMO!
	}*/

	// CONSTRUCTOR INJECTION
	@Autowired // Qua è OPZIONALE l'annotazione Autowired, se non la metto Spring comunque inietta le dipendenze
	public Interviewer(@Qualifier("getFullstackStudent") IStudent student, @Qualifier("getName") String name, @Qualifier("getSurname") String surname) { // <-- ACCOPPIAMENTO DEBOLE, LO VOGLIAMO!
		this.student = student;
		this.name = name;
		this.surname = surname;
	}

	public void asksQuestion() {
		System.out.println("Ciao sono " + this.name + " " + this.surname);
		System.out.println("Ciao studente " + this.student.getName() + ". Per favore rispondimi alla seguente domanda...blablabla...");
		this.student.answersQuestion();
	}
}
