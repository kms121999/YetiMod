package tutorialmod;

import org.apache.logging.log4j.Logger;
import tutorialmod.init.TutorialEntities;
import tutorialmod.init.TutorialItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class TutorialModRegistries 
{
	public static final ItemGroup TUTORIAL = TutorialMod.TUTORIAL;
	public static final Logger LOGGER = TutorialMod.LOGGER;
	public static final String MODID = TutorialMod.MODID;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(
			TutorialItems.tutorial_item = new Item(new Item.Properties().group(TUTORIAL)).setRegistryName(location("tutorial_item"))
		);
		
		TutorialEntities.registerEntitySpawnEggs(event);
		
		LOGGER.info("Items registered.");
	}
	
	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
	{
		event.getRegistry().registerAll
		(
			TutorialEntities.tutorial_entity
		);
		
		TutorialEntities.registerEntityWorldSpawns();
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}	