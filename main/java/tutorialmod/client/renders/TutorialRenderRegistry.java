package tutorialmod.client.renders;

import tutorialmod.entities.TutorialEntity;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@OnlyIn(Dist.CLIENT)
public class TutorialRenderRegistry 
{
	public static void registryEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(TutorialEntity.class, new TutorialEntityRender.RenderFactory());
	}
}