package com.sg.FlooringProject.ui;

public class FlooringProjectView {
    private UserIO io= new UserIOImpl();
/*
All we have done is move the functionality for printing the menu
and getting the user's selection from the controller over to the view.
 */
    public int printMenuAndGetSelection(){
        io.print("<<Flooring Program>>");
        io.print("1. Display Orders");
        io.print ("2. Add an Order");
        io.print ("3. Edit an Order");
        io.print ("4. Remove an Order");
        io.print ("5. Export All Data");
        io.print(" 6.Quit");

        return io.readInt("Please select from the above choices", 1, 5);
    }
}
