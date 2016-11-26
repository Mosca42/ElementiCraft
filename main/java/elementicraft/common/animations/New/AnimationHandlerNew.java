package elementicraft.common.animations.New;

import java.util.HashMap;

import elementicraft.common.MCACommonLibrary.IMCAnimatedEntity;
import elementicraft.common.MCACommonLibrary.animation.AnimationHandler;
import elementicraft.common.MCACommonLibrary.animation.Channel;

public class AnimationHandlerNew extends AnimationHandler {
	/** Map with all the animations. */
	public static HashMap<String, Channel> animChannels = new HashMap<String, Channel>();
static
{
animChannels.put("animation", new ChannelAnimation("animation", 20.0F, 40, Channel.LOOP));
}
	public AnimationHandlerNew(IMCAnimatedEntity entity) {
		super(entity);
	}

	@Override
	public void activateAnimation(String name, float startingFrame) {
		super.activateAnimation(animChannels, name, startingFrame);
	}

	@Override
	public void stopAnimation(String name) {
		super.stopAnimation(animChannels, name);
	}

	@Override
	public void fireAnimationEventClientSide(Channel anim, float prevFrame, float frame) {
	}

	@Override
	public void fireAnimationEventServerSide(Channel anim, float prevFrame, float frame) {
	}}