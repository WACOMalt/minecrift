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
    public static final int DISPLAY_VISIBLE = 0;
    public static final int DISPLAY_NOT_VISIBLE = 1;
    public static final int DISPLAY_SHUTDOWN = 2;

    public RenderTextureInfo getRenderTextureSizes(FovPort LeftFov,
                                                   FovPort RightFov,
                                                   float renderScaleFactor);

    public boolean providesMirrorTexture();

    public int createMirrorTexture(int width, int height);

    public void deleteMirrorTexture();

    public boolean providesRenderTextures();

    public RenderTextureSet createRenderTextureSet(int lwidth, int lheight, int rwidth, int rheight);

    public void deleteRenderTextures();

    public EyeType eyeRenderOrder(int index);

    public boolean usesDistortion();

    public boolean isStereo();

    public boolean isGuiOrtho();

    public double getFrameTiming();

    public Matrix4f getProjectionMatrix(FovPort fov,
                                        float nearClip,
                                        float farClip);

    public double getCurrentTimeSecs();

	public int getEyeRenderTexture(EyeType eye);

    public void endEyeRender(EyeType eye);

    public String getLastError();

    public void configureRenderer(GLConfig cfg);
}