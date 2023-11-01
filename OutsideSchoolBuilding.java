
public class OutsideSchoolBuilding extends State{
	private Model model;
	
	public OutsideSchoolBuilding(Model model) {
		this.model = model;

		State getDescription = "You decided to go to school. You walk very quickly and make it outside the school building just in time. There, you see your best friend and decide to talk to her. You two have been best friends since childhood. After a leghthy conversation, she asks you if you want to skip class and hang out in the Playground. Do you want to skip class? Type 1 for yes. Type 2 for no."  
		State getOptions;
		State processChoice(int choice) ;
	}
}
