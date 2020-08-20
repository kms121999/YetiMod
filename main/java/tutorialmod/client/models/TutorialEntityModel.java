package tutorialmod.client.models;

import tutorialmod.entities.TutorialEntity;
import net.minecraft.client.renderer.entity.model.CowModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TutorialEntityModel extends EntityModel<TutorialEntity>
{
	private final ModelRenderer field_78176_b0;
	private final ModelRenderer field_78176_b1;
	private final ModelRenderer field_78174_d;
	private final ModelRenderer field_78177_c;
	private final ModelRenderer field_78175_e;
	private final ModelRenderer field_78178_a0;
	private final ModelRenderer Horn;
	private final ModelRenderer field_78178_a1;
	private final ModelRenderer field_78173_f;

	public ModelIronGolem() {
		textureWidth = 128;
		textureHeight = 128;

		field_78176_b0 = new ModelRenderer(this);
		field_78176_b0.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78176_b0.setTextureOffset(0, 40).addBox(-9.0F, -3.0F, -5.0F, 18.0F, 10.0F, 9.0F, 0.0F, false);

		field_78176_b1 = new ModelRenderer(this);
		field_78176_b1.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78176_b1.setTextureOffset(0, 102).addBox(-7.5F, 4.0F, -3.0F, 15.0F, 9.0F, 6.0F, 0.5F, false);

		field_78174_d = new ModelRenderer(this);
		field_78174_d.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78174_d.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -4.0F, 5.0F, 23.0F, 7.0F, 0.0F, false);

		field_78177_c = new ModelRenderer(this);
		field_78177_c.setRotationPoint(0.0F, -7.0F, 0.0F);
		field_78177_c.setTextureOffset(60, 21).addBox(-14.0F, -2.5F, -4.0F, 5.0F, 23.0F, 7.0F, 0.0F, false);

		field_78175_e = new ModelRenderer(this);
		field_78175_e.setRotationPoint(-4.0F, 11.0F, 0.0F);
		field_78175_e.setTextureOffset(37, 0).addBox(-3.5F, -5.0F, -3.0F, 6.0F, 18.0F, 5.0F, 0.0F, false);

		field_78178_a0 = new ModelRenderer(this);
		field_78178_a0.setRotationPoint(3.0F, -14.8333F, -2.6667F);
		field_78178_a0.setTextureOffset(0, 0).addBox(-7.0F, -4.1667F, -3.8333F, 8.0F, 9.0F, 7.0F, 0.0F, false);
		field_78178_a0.setTextureOffset(92, 3).addBox(0.0F, -2.1667F, 0.1667F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		field_78178_a0.setTextureOffset(97, 50).addBox(5.0F, -6.1667F, 0.1667F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		field_78178_a0.setTextureOffset(97, 50).addBox(-12.0F, -6.1667F, 0.1667F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		field_78178_a0.setTextureOffset(20, 30).addBox(-4.0F, 0.8333F, -4.8333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		field_78178_a0.setTextureOffset(92, 2).addBox(-9.0F, -1.1667F, 0.1667F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Horn = new ModelRenderer(this);
		Horn.setRotationPoint(2.5F, -1.6667F, 1.1667F);
		field_78178_a0.addChild(Horn);
		Horn.setTextureOffset(97, 50).addBox(-1.5F, -1.5F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		Horn.setTextureOffset(97, 50).addBox(-14.5F, -1.5F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		field_78178_a1 = new ModelRenderer(this);
		field_78178_a1.setRotationPoint(0.0F, -7.0F, -2.0F);
		

		field_78173_f = new ModelRenderer(this);
		field_78173_f.setRotationPoint(5.0F, 11.0F, 0.0F);
		field_78173_f.setTextureOffset(87, 11).addBox(-3.5F, -5.0F, -3.0F, 6.0F, 18.0F, 5.0F, 0.0F, true);
		field_78173_f.setTextureOffset(97, 98).addBox(-3.5F, 9.0F, -8.0F, 6.0F, 4.0F, 6.0F, 0.0F, true);
		field_78173_f.setTextureOffset(97, 98).addBox(-12.5F, 9.0F, -8.0F, 6.0F, 4.0F, 6.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		field_78176_b0.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78176_b1.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78174_d.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78177_c.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78175_e.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78178_a0.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78178_a1.render(matrixStack, buffer, packedLight, packedOverlay);
		field_78173_f.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
}