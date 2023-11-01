
public class Classroom extends State{
	private Model model;
	
	public Classroom(Model model) {
		this.model = model;

		State getDescription = "You decide to go to class since you are taking a test today. Your friend meets you in the classroom after the class period is over. While there she asks you if you want to come to her club meeting. She is the Vice President of the Musical Theater Club. Do you want to join her? Type 1 for yes. Type 2 for no."
		State getOptions;
		State processChoice(int choice) ;
	}
}
