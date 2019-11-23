package utilidades;

import java.util.ArrayList;
import item.Item;

public abstract class Mochila {
	
	private static int level = 1;
	private static int maxSize = 12;
	private static float slotCapacity = (float) 1.5; // capacidade de cada slot
	private static float maxWeight = maxSize * slotCapacity;
    private static ArrayList<Item> slot = new ArrayList<>();
    
    
    public static int getLevel() {
    	return level;
    }
    public static int getSize() {
    	return maxSize;
    }
    public static float getMaxWeight() {
    	return maxWeight;
    }
    
    /*
     *  Só vai funcionar quando adicionar o peso em item
     * 
    public static float weight() {
    	float w = 0;
    	for (Item i : slot)
    		w += i.getWeight(); 
    	return w;
    }
    */
    
    public static void upgradeCapacity() {
    	slotCapacity += 0.5;
    }
    
    public static void upgradeSize() {
    	maxSize += 2;
    }
    
    public static void levelUp() {
    	level++;
    	upgradeCapacity();
    	upgradeSize();
    }
    
    /*
    public static void add(Item item){
        if (slot.size() < maxSize) {
            // se o tamanho da lista for menor que o tamanho máximo suportado pela mochila
            if (weight() + item.getWeight() <= maxWeight){
                // se o acréscimo desse item não exceder o peso máximo
                slot.add(item);
            } else System.out.println("Impossível adicionar: Objeto muito pesado!");
        } else System.out.println("Impossível adicionar: Mochila cheia!");
    }
    
    public static void showInfo() {
        System.out.println("--Mochila-[level "+ level +"]---------------");
        for (Item i : slot)
            System.out.printf("%s\t%.2f kg\n", i.getName(), i.getWeight());
        System.out.printf("\nNúmero de itens: %d (máx: %d)\n", slot.size(), maxSize);
        System.out.printf("Peso total: %.2fkg (máx: %.1fkg)\n", weight(), maxWeight);
        System.out.println("---------------------------------");
    }
    */
}