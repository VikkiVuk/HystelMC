package jayden.mod.util.compat.jei.sintering;

import java.awt.Color;
import java.util.List;

import jayden.mod.objects.blocks.machines.sintering.SinteringFurnaceRecipes;
import jayden.mod.util.compat.jei.JEICompat;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

public class SinteringRecipe implements IRecipeWrapper
{
	private final List<ItemStack> inputs;
	private final ItemStack output;
	
	public SinteringRecipe(List<ItemStack> inputs, ItemStack output)
	{
		this.inputs = inputs;
		this.output = output;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) 
	{
		ingredients.setInputs(ItemStack.class, inputs);		
		ingredients.setOutput(ItemStack.class, output);
		
	}
	
	@Override
	public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY) 
	{
		SinteringFurnaceRecipes recipes = SinteringFurnaceRecipes.getInstance();
		float experience = recipes.getSinteringExperience(output);
		
		if(experience > 0)
		{
			String experienceString = JEICompat.translateToLocalFormatted("gui.jei.category.smelting.experience", experience);
			FontRenderer renderer = minecraft.fontRenderer;
			int stringWidth = renderer.getStringWidth(experienceString);
			renderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.BLUE.getRGB());
		}
	}
}
