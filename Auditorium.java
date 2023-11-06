
public class Auditorium extends State{
	private Model model;
	
	public Auditorium(Model model) {
		this.model = model;

		State getDescription = "You decide to go with your friend to the club meeting. You follow her to the auditorium. There, you meet three other girls. The first is a shy girl with long, black hair and blue eyes. The second is a cute but tough girl with short, blond hair and green eyes. The third is the Club President. She is the most popular girl in school. She has long brown hair with matching eyes. The Club President asks you if you want to join the club. Do you want to join the club? Type 1 for yes. Type 2 for no.";
		State getOptions;
		State processChoice(int choice) ;
	}
}
