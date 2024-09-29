interface UI {
	Coffee choose_coffee(Person person);
	void count_sugar();
	void payment(Person p) throws CMErr,  USErr;
	void order();
	void cooking_coffee(Person person);
}