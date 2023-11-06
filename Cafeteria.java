
public class Cafeteria extends State{
	private Model model;
	
	public Cafeteria(Model model) {
		this.model = model;

		State getDescription = "You decide to join the club so you can get closer to each of these girls. Maybe you can start a relationship with one of them? You and the four girls go to the cafeteria for lunch. While there, the girls discuss the upcoming musical they are performing. Each of the girls are doing something different. The shy girl is designing the set. The cute girl is doing coreography. The Club President is writing the script. Your friend is writing the lyrics for the songs. Which one of these girls do you want to help out? Type 1 for the shy girl. Type 2 for the cute girl. Type 3 for the Club President. Type 4 for your best friend."
		State getOptions;
		State processChoice(int choice);	
	}
}
