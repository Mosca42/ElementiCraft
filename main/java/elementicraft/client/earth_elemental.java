package elementicraft.client;

import java.util.HashMap;

import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import elementicraft.client.MCAClientLibrary.MCAModelRenderer;
import elementicraft.common.MCACommonLibrary.MCAVersionChecker;
import elementicraft.common.MCACommonLibrary.animation.AnimationHandler;
import elementicraft.common.MCACommonLibrary.math.Matrix4f;
import elementicraft.common.MCACommonLibrary.math.Quaternion;

public class earth_elemental extends ModelBase {
public final int MCA_MIN_REQUESTED_VERSION = 5;
public HashMap<String, MCAModelRenderer> parts = new HashMap<String, MCAModelRenderer>();

MCAModelRenderer head;
MCAModelRenderer head2;
MCAModelRenderer eyes;
MCAModelRenderer body;
MCAModelRenderer body2;
MCAModelRenderer body3;
MCAModelRenderer body4;
MCAModelRenderer body5;
MCAModelRenderer rightarm;
MCAModelRenderer leftarm;
MCAModelRenderer rightshoulder;
MCAModelRenderer leftshoulder;
MCAModelRenderer stone1;
MCAModelRenderer stone2;
MCAModelRenderer stone3;
MCAModelRenderer stone4;
MCAModelRenderer stone5;
MCAModelRenderer stone6;
MCAModelRenderer stone7;
MCAModelRenderer stone8;
MCAModelRenderer stone9;
MCAModelRenderer stone12;
MCAModelRenderer stone13;
MCAModelRenderer stone14;
MCAModelRenderer stone15;
MCAModelRenderer stone16;
MCAModelRenderer stone17;

public earth_elemental()
{
MCAVersionChecker.checkForLibraryVersion(getClass(), MCA_MIN_REQUESTED_VERSION);

textureWidth = 64;
textureHeight = 64;

head = new MCAModelRenderer(this, "head", 0, 0);
head.mirror = false;
head.addBox(-4.0F, 0.0F, -4.0F, 8, 8, 8);
head.setInitialRotationPoint(0.0F, 9.0F, 1.0F);
head.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F)).transpose());
head.setTextureSize(64, 64);
parts.put(head.boxName, head);

head2 = new MCAModelRenderer(this, "head2", 40, 38);
head2.mirror = false;
head2.addBox(0.0F, -6.0F, -5.0F, 6, 6, 6);
head2.setInitialRotationPoint(-3.0F, 15.0F, 8.0F);
head2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.44481096F, 0.0F, 0.0F, 0.8956245F)).transpose());
head2.setTextureSize(64, 64);
parts.put(head2.boxName, head2);

eyes = new MCAModelRenderer(this, "eyes", 0, 34);
eyes.mirror = false;
eyes.addBox(0.0F, -1.0F, -1.0F, 6, 1, 1);
eyes.setInitialRotationPoint(-3.0F, 12.0F, 7.0F);
eyes.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.19936793F, 0.0F, 0.0F, 0.9799247F)).transpose());
eyes.setTextureSize(64, 64);
parts.put(eyes.boxName, eyes);

body = new MCAModelRenderer(this, "body", 34, 0);
body.mirror = false;
body.addBox(-4.0F, -8.0F, -1.0F, 12, 8, 3);
body.setInitialRotationPoint(-2.0F, 10.0F, 0.0F);
body.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.12975822F, 0.0F, 0.0F, 0.9915457F)).transpose());
body.setTextureSize(64, 64);
parts.put(body.boxName, body);

body2 = new MCAModelRenderer(this, "body2", 32, 52);
body2.mirror = false;
body2.addBox(0.0F, -6.0F, -6.0F, 10, 6, 6);
body2.setInitialRotationPoint(-5.0F, 10.0F, 2.0F);
body2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.11130472F, 0.0F, 0.0F, 0.99378633F)).transpose());
body2.setTextureSize(64, 64);
parts.put(body2.boxName, body2);

body3 = new MCAModelRenderer(this, "body3", 0, 16);
body3.mirror = false;
body3.addBox(0.0F, -8.0F, -6.0F, 16, 8, 6);
body3.setInitialRotationPoint(-8.0F, 11.0F, 2.0F);
body3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.12975822F, 0.0F, 0.0F, 0.9915457F)).transpose());
body3.setTextureSize(64, 64);
parts.put(body3.boxName, body3);

body4 = new MCAModelRenderer(this, "body4", 32, 0);
body4.mirror = false;
body4.addBox(0.0F, -8.0F, -4.0F, 12, 8, 4);
body4.setInitialRotationPoint(-6.0F, 2.0F, -1.0F);
body4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.11130472F, 0.0F, 0.0F, 0.99378633F)).transpose());
body4.setTextureSize(64, 64);
parts.put(body4.boxName, body4);

body5 = new MCAModelRenderer(this, "body5", 0, 16);
body5.mirror = false;
body5.addBox(0.0F, -11.0F, -6.0F, 14, 11, 6);
body5.setInitialRotationPoint(-7.0F, 11.0F, 0.0F);
body5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.12975822F, 0.0F, 0.0F, 0.9915457F)).transpose());
body5.setTextureSize(64, 64);
parts.put(body5.boxName, body5);

rightarm = new MCAModelRenderer(this, "rightarm", 46, 12);
rightarm.mirror = false;
rightarm.addBox(-3.0F, -16.0F, -3.0F, 4, 18, 5);
rightarm.setInitialRotationPoint(-7.0F, 8.0F, -1.0F);
rightarm.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, -0.25881904F, 0.9659258F)).transpose());
rightarm.setTextureSize(64, 64);
parts.put(rightarm.boxName, rightarm);

leftarm = new MCAModelRenderer(this, "leftarm", 46, 12);
leftarm.mirror = false;
leftarm.addBox(-1.0F, -16.0F, -3.0F, 4, 18, 5);
leftarm.setInitialRotationPoint(7.0F, 8.0F, -1.0F);
leftarm.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.25881904F, 0.9659258F)).transpose());
leftarm.setTextureSize(64, 64);
parts.put(leftarm.boxName, leftarm);

rightshoulder = new MCAModelRenderer(this, "rightshoulder", 0, 49);
rightshoulder.mirror = false;
rightshoulder.addBox(0.0F, -7.0F, -8.0F, 6, 7, 8);
rightshoulder.setInitialRotationPoint(-9.0F, 13.0F, 3.0F);
rightshoulder.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, -0.25881904F, 0.9659258F)).transpose());
rightshoulder.setTextureSize(64, 64);
parts.put(rightshoulder.boxName, rightshoulder);

leftshoulder = new MCAModelRenderer(this, "leftshoulder", 0, 49);
leftshoulder.mirror = false;
leftshoulder.addBox(0.0F, -7.0F, -8.0F, 6, 7, 8);
leftshoulder.setInitialRotationPoint(4.0F, 10.0F, 3.0F);
leftshoulder.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.25881904F, 0.9659258F)).transpose());
leftshoulder.setTextureSize(64, 64);
parts.put(leftshoulder.boxName, leftshoulder);

stone1 = new MCAModelRenderer(this, "stone1", 19, 39);
stone1.mirror = false;
stone1.addBox(-2.2666667F, -2.6F, -2.2666667F, 5, 5, 5);
stone1.setInitialRotationPoint(2.9333334F, -10.533334F, 2.0F);
stone1.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.061436843F, -0.41006956F, -0.1348293F, 0.8999386F)).transpose());
stone1.setTextureSize(64, 64);
parts.put(stone1.boxName, stone1);

stone2 = new MCAModelRenderer(this, "stone2", 0, 41);
stone2.mirror = false;
stone2.addBox(-1.9333333F, -2.2F, -1.2666667F, 4, 4, 4);
stone2.setInitialRotationPoint(-4.0666666F, -12.533334F, -2.1999998F);
stone2.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.09038848F, -0.31571424F, 0.25997522F, 0.90805686F)).transpose());
stone2.setTextureSize(64, 64);
parts.put(stone2.boxName, stone2);

stone3 = new MCAModelRenderer(this, "stone3", 27, 33);
stone3.mirror = false;
stone3.addBox(-1.2666667F, -1.4F, -1.0666667F, 3, 3, 3);
stone3.setInitialRotationPoint(-0.6666667F, -16.266666F, 5.0F);
stone3.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0426124F, -0.32562208F, -0.12256174F, 0.93655384F)).transpose());
stone3.setTextureSize(64, 64);
parts.put(stone3.boxName, stone3);

stone4 = new MCAModelRenderer(this, "stone4", 19, 33);
stone4.mirror = false;
stone4.addBox(-1.1333333F, -1.0F, -0.9333333F, 2, 2, 2);
stone4.setInitialRotationPoint(1.0F, -18.0F, -0.73333335F);
stone4.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.06069601F, -0.32274067F, 0.17457378F, 0.92826635F)).transpose());
stone4.setTextureSize(64, 64);
parts.put(stone4.boxName, stone4);

stone5 = new MCAModelRenderer(this, "stone5", 27, 33);
stone5.mirror = false;
stone5.addBox(0.0F, -3.0F, -3.0F, 3, 3, 3);
stone5.setInitialRotationPoint(2.0F, 13.0F, -5.0F);
stone5.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.043982744F, -0.25777242F, -0.09330478F, 0.96068364F)).transpose());
stone5.setTextureSize(64, 64);
parts.put(stone5.boxName, stone5);

stone6 = new MCAModelRenderer(this, "stone6", 19, 39);
stone6.mirror = false;
stone6.addBox(0.0F, -5.0F, -5.0F, 5, 5, 5);
stone6.setInitialRotationPoint(-6.0F, 13.0F, -3.0F);
stone6.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.23865439F, -0.072130024F, 0.017778454F, 0.9682589F)).transpose());
stone6.setTextureSize(64, 64);
parts.put(stone6.boxName, stone6);

stone7 = new MCAModelRenderer(this, "stone7", 0, 41);
stone7.mirror = false;
stone7.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone7.setInitialRotationPoint(-1.0F, 14.533334F, -4.0F);
stone7.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.16764432F, -0.16764432F, -0.10581663F, 0.9657089F)).transpose());
stone7.setTextureSize(64, 64);
parts.put(stone7.boxName, stone7);

stone8 = new MCAModelRenderer(this, "stone8", 0, 41);
stone8.mirror = false;
stone8.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone8.setInitialRotationPoint(0.0F, 11.0F, -5.0F);
stone8.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.1952988F, 0.2124548F, -0.03406102F, 0.95684963F)).transpose());
stone8.setTextureSize(64, 64);
parts.put(stone8.boxName, stone8);

stone9 = new MCAModelRenderer(this, "stone9", 0, 41);
stone9.mirror = false;
stone9.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone9.setInitialRotationPoint(-16.0F, 2.0F, 0.5F);
stone9.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, -0.25881904F, 0.9659258F)).transpose());
stone9.setTextureSize(64, 64);
parts.put(stone9.boxName, stone9);

stone12 = new MCAModelRenderer(this, "stone12", 0, 41);
stone12.mirror = false;
stone12.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone12.setInitialRotationPoint(12.0F, 1.0F, 0.5F);
stone12.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.0F, 0.0F, 0.25881904F, 0.9659258F)).transpose());
stone12.setTextureSize(64, 64);
parts.put(stone12.boxName, stone12);

stone13 = new MCAModelRenderer(this, "stone13", 19, 39);
stone13.mirror = false;
stone13.addBox(0.0F, -5.0F, -5.0F, 5, 5, 5);
stone13.setInitialRotationPoint(5.0F, 11.0F, 1.0F);
stone13.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.3635534F, -0.1106368F, 0.36711568F, 0.8490079F)).transpose());
stone13.setTextureSize(64, 64);
parts.put(stone13.boxName, stone13);

stone14 = new MCAModelRenderer(this, "stone14", 19, 39);
stone14.mirror = false;
stone14.addBox(0.0F, -5.0F, -5.0F, 5, 5, 5);
stone14.setInitialRotationPoint(-7.0F, 14.0F, -1.0F);
stone14.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.4761521F, 0.38824597F, -0.43368804F, 0.6591349F)).transpose());
stone14.setTextureSize(64, 64);
parts.put(stone14.boxName, stone14);

stone15 = new MCAModelRenderer(this, "stone15", 0, 41);
stone15.mirror = false;
stone15.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone15.setInitialRotationPoint(0.0F, 5.0F, -6.0F);
stone15.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.27047592F, 0.37700087F, -0.22581169F, 0.8565759F)).transpose());
stone15.setTextureSize(64, 64);
parts.put(stone15.boxName, stone15);

stone16 = new MCAModelRenderer(this, "stone16", 19, 39);
stone16.mirror = false;
stone16.addBox(0.0F, -5.0F, -5.0F, 5, 5, 5);
stone16.setInitialRotationPoint(0.0F, 3.0F, -3.0F);
stone16.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(0.26889297F, 0.30458552F, 0.31475866F, 0.85781765F)).transpose());
stone16.setTextureSize(64, 64);
parts.put(stone16.boxName, stone16);

stone17 = new MCAModelRenderer(this, "stone17", 0, 41);
stone17.mirror = false;
stone17.addBox(0.0F, -4.0F, -4.0F, 4, 4, 4);
stone17.setInitialRotationPoint(4.0F, 10.0F, -7.0F);
stone17.setInitialRotationMatrix(new Matrix4f().set(new Quaternion(-0.39157197F, 0.18404184F, -0.1620054F, 0.8868789F)).transpose());
stone17.setTextureSize(64, 64);
parts.put(stone17.boxName, stone17);

}

@Override
public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) 
{
EntityLiving entity = (EntityLiving)par1Entity;

AnimationHandler.performAnimationInModel(parts, entity);

//Render every non-child part
head.render(par7);
head2.render(par7);
eyes.render(par7);
body.render(par7);
body2.render(par7);
body3.render(par7);
body4.render(par7);
body5.render(par7);
rightarm.render(par7);
leftarm.render(par7);
rightshoulder.render(par7);
leftshoulder.render(par7);
stone1.render(par7);
stone2.render(par7);
stone3.render(par7);
stone4.render(par7);
stone5.render(par7);
stone6.render(par7);
stone7.render(par7);
stone8.render(par7);
stone9.render(par7);
stone12.render(par7);
stone13.render(par7);
stone14.render(par7);
stone15.render(par7);
stone16.render(par7);
stone17.render(par7);
}
@Override
public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {}

public MCAModelRenderer getModelRendererFromName(String name)
{
return parts.get(name);
}
}