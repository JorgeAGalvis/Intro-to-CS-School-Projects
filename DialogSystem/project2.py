#project2
#Jorge Galvis 

# A Dialog System for Ordering Pizza

def toppings():
    #create an empty list to store the chosen toppings 
    toppings_choices = []
    while True:

        #prompt the user for the toppings 
        toppings_input = input("Add a topping: pepperoni, mushrooms, spinach, or say 'done': ").lower()

        #condition 
        if toppings_input == "done":
            break 
        else:   #add topping to the declared list 
            toppings_choices.append(toppings_input)


    toppings_result = " and ".join(toppings_choices)
    return toppings_result


def pizza():
    #prompt the user for pizza size 
    pizza_size = input("small, medium, or large? ").lower()
    #call the toppings function
    pizza_toppings = toppings()
    #return a string with the size and toppings 
    pizza_order = (f"a {pizza_size} pizza with {pizza_toppings}")
    return pizza_order

def dressing():
    #prompt the user for the toppings 
    dressing_input = input("please choose a dressing: vinaigrette, ranch, blue cheese, lemon: ").lower()
    #add the work with to the input of the string
    dressing_choice = dressing_input
    #return a string with the selected dressing 
    return dressing_choice


def salad():
    #prompt the user for pizza size 
    salad_type = input("Would you like a garden salad or greek salad: ").lower()
    #call the toppings function
    salad_dressing = dressing()
    #return a string with the size and toppings 
    salad_order = (f"a {salad_type} salad with {salad_dressing} dressing")
    return salad_order


def select_meal():
    #list for all orders
    pizza_list = []
    salad_list = []

    #Prompt the user until the input is 'done'
    while True:

        #prompt user for meal choice 
        choice = input("Hello, would you like pizza or salad? ").lower()
        
        #check choice 
        if choice == "done":
            print("Your order has been placed. Goodbye.")
            break
        elif choice == "pizza":
            pizza_choice = pizza()
            pizza_list.append(pizza_choice)
            if pizza_list or salad_list:
                current_order = pizza_list + salad_list
                current_order = " and ".join(current_order)
                print(f"You ordered {current_order}. Place another order or say 'done'")
        elif choice == "salad":
            salad_choice = salad()
            salad_list.append(salad_choice)
            if salad_list or pizza_list:
                current_order = salad_list + pizza_list
                current_order = " and ".join(current_order)
                print(f"You ordered {current_order}. Place another order or say 'done'")
    
#call select_meal()
select_meal()





