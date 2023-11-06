
public class Playground extends State{
	private Model model;
	
	public Playground(Model model) {
		this.model = model;

		State getDescription = "You decide to go to the playground with your friend since you are not doing anything important in class today other than lectures. After a while of hanging out, she asks you if you want to go with her to her club meeting. She is the Vice President of the Musical Theater Club. Do you want to go to her club meeting. Type 1 for yes. Type 2 for no."
		State getOptions;
		State processChoice(int choice) ;
	}
}
