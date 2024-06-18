package riccardogulin.u5d2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import riccardogulin.u5d2.dao.StudentsDAO;

@Component // Se non mettiamo @Component il runner non verrà avviato automaticamente
public class MyRunner implements CommandLineRunner {

	@Autowired
	private StudentsDAO studentsDAO;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CIAO DAL RUNNER");
		studentsDAO.save();
		studentsDAO.findById();
	}
}
