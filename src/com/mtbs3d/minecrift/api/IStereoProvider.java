/**
 * Copyright 2014 StellaArtois
 * Licensed under the LGPL 3.0 or later (See LICENSE.md for details)
 */
package com.mtbs3d.minecrift.api;


import de.fruitfly.ovr.enums.EyeType;
import de.fruitfly.ovr.structs.*;

/**
 * Implement this to provide Minecrift with stereo rendering services
 *
 * @author StellaArtois
 *
 */
public interface IStereoProvider extends IBasePlugin
{
    public RenderTextureInfo getRenderTextureSizes(FovPort LeftFov,
                                                   FovPort RightFov,
                                                   float renderScaleFactor);

    public SwapTextureSet createRenderTextureSet(int lwidth, int lheight, int rwidth, int rheight);

    public int createMirrorTexture(int width, int height);

    public EyeType eyeRenderOrder(int index);

    public boolean usesDistortion();

    public boolean isStereo();

    public boolean isGuiOrtho();

    public Matrix4f getProjectionMatrix(FovPort fov,
                                        float nearClip,
                                        float farClip);

    public double getCurrentTimeSecs();

	public boolean setCurrentRenderTextureIndex(int currentSwapIdx);
}