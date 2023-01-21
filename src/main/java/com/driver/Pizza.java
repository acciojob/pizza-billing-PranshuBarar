package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean extraCheeseAdded;
    boolean extraToppingsAdded;
    boolean takeAwayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraToppingsAdded = false;
        this.extraCheeseAdded = false;
        this.takeAwayAdded = false;
        if(isVeg){
            price = 300;
        }
        else {
            price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!this.extraCheeseAdded){
            price += 80;
            bill += "Extra Cheese Added: " + 80 + "\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!this.extraToppingsAdded){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: " + 70 + "\n";
            }
            else {
                price += 120;
                bill += "Extra Toppings Added: " + 120 + "\n";
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!this.takeAwayAdded){
            price += 20;
            bill += "Paperbag Added: " + 20 + "\n";
            takeAwayAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            bill += "Total Price: " + price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
