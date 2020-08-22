package tutorialmod.client.models;

import tutorialmod.entities.TutorialEntity; 
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TutorialEntityModel extends EntityModel<TutorialEntity>
{
	private final RendererModel chest;
	private final RendererModel torso;
	private final RendererModel leftArm;
	private final RendererModel rightArm;
	private final RendererModel rightLeg;
	private final RendererModel head;
	private final RendererModel horn;
	private final RendererModel misc;
	private final RendererModel leftLeg;

	public TutorialEntityModel() {
		textureWidth = 128;
		textureHeight = 128;

		chest = new RendererModel(this);
		chest.setRotationPoint(0.0F, -7.0F, 0.0F);
		chest.cubeList.add(new ModelBox(chest, 0, 40, -9.0F, -3.0F, -5.0F, 18, 10, 9, 0.0F, false));

		torso = new RendererModel(this);
		torso.setRotationPoint(0.0F, -7.0F, 0.0F);
		torso.cubeList.add(new ModelBox(torso, 0, 102, -7.5F, 4.0F, -3.0F, 15, 9, 6, 0.5F, false));

		leftArm = new RendererModel(this);
		leftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 60, 58, 9.0F, -2.5F, -4.0F, 5, 23, 7, 0.0F, false));

		rightArm = new RendererModel(this);
		rightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 60, 21, -14.0F, -2.5F, -4.0F, 5, 23, 7, 0.0F, false));

		rightLeg = new RendererModel(this);
		rightLeg.setRotationPoint(-4.0F, 11.0F, 0.0F);
		rightLeg.cubeList.add(new ModelBox(rightLeg, 37, 0, -3.5F, -5.0F, -3.0F, 6, 18, 5, 0.0F, false));
		rightLeg.cubeList.add(new ModelBox(rightLeg, 97, 98, -3.5F, 9.0F, -8.0F, 6, 4, 6, 0.0F, true));

		head = new RendererModel(this);
		head.setRotationPoint(3.0F, -14.8333F, -2.6667F);
		head.cubeList.add(new ModelBox(head, 0, 0, -7.0F, -4.1667F, -3.8333F, 8, 9, 7, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 92, 3, 0.0F, -2.1667F, 0.1667F, 3, 3, 2, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 20, 30, -4.0F, 0.8333F, -4.8333F, 2, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 92, 2, -9.0F, -1.1667F, 0.1667F, 3, 3, 2, 0.0F, false));

		horn = new RendererModel(this);
		horn.setRotationPoint(2.5F, -1.6667F, 1.1667F);
		head.addChild(horn);
		horn.cubeList.add(new ModelBox(horn, 97, 50, -1.5F, -1.5F, -1.0F, 5, 1, 2, 0.0F, false));
		horn.cubeList.add(new ModelBox(horn, 97, 50, -14.5F, -1.5F, -1.0F, 5, 1, 2, 0.0F, false));
		horn.cubeList.add(new ModelBox(horn, 97, 50, -14.5F, -4.5F, -1.0F, 1, 3, 2, 0.0F, false));
		horn.cubeList.add(new ModelBox(horn, 97, 50, 2.5F, -4.5F, -1.0F, 1, 3, 2, 0.0F, false));

		misc = new RendererModel(this);
		misc.setRotationPoint(0.0F, -7.0F, -2.0F);
		

		leftLeg = new RendererModel(this);
		leftLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
		leftLeg.cubeList.add(new ModelBox(leftLeg, 87, 11, -3.5F, -5.0F, -3.0F, 6, 18, 5, 0.0F, true));
		leftLeg.cubeList.add(new ModelBox(leftLeg, 97, 98, -3.5F, 9.0F, -8.0F, 6, 4, 6, 0.0F, true));
	}

	@Override
	public void render(TutorialEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chest.render(f5);
		torso.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
		rightLeg.render(f5);
		head.render(f5);
		misc.render(f5);
		leftLeg.render(f5);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
