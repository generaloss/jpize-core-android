package jpize.android.opengl;

import android.opengl.*;
import jpize.opengl.gl.GLI14;
import java.nio.*;

public class AndroidGL14 extends AndroidGL13 implements GLI14 {

    @Override
    public void glBlendColor(float red, float green, float blue, float alpha) {
        GLES32.glBlendColor(red, green, blue, alpha);
    }

    @Override
    public void glBlendEquation(int mode) {
        GLES32.glBlendEquation(mode);
    }

    @Override
    public void glFogCoordf(float var0) {
        GLES32.glFogCoordf(var0);
    }

    @Override
    public void glFogCoordd(double var0) {
        GLES32.glFogCoordd(var0);
    }

    @Override
    public void nglFogCoordfv(long var0) {
        GLES32.nglFogCoordfv(var0);
    }

    @Override
    public void glFogCoordfv(FloatBuffer coord) {
        GLES32.glFogCoordfv(coord);
    }

    @Override
    public void nglFogCoorddv(long var0) {
        GLES32.nglFogCoorddv(var0);
    }

    @Override
    public void glFogCoorddv(DoubleBuffer coord) {
        GLES32.glFogCoorddv(coord);
    }

    @Override
    public void nglFogCoordPointer(int var0, int var1, long var2) {
        GLES32.nglFogCoordPointer(var0, var1, var2);
    }

    @Override
    public void glFogCoordPointer(int type, int stride, ByteBuffer pointer) {
        GLES32.glFogCoordPointer(type, stride, pointer);
    }

    @Override
    public void glFogCoordPointer(int type, int stride, long pointer) {
        GLES32.glFogCoordPointer(type, stride, pointer);
    }

    @Override
    public void glFogCoordPointer(int type, int stride, ShortBuffer pointer) {
        GLES32.glFogCoordPointer(type, stride, pointer);
    }

    @Override
    public void glFogCoordPointer(int type, int stride, FloatBuffer pointer) {
        GLES32.glFogCoordPointer(type, stride, pointer);
    }

    @Override
    public void nglMultiDrawArrays(int mode, long first, long count, int drawcount) {
        GLES32.nglMultiDrawArrays(mode, first, count, drawcount);
    }

    @Override
    public void glMultiDrawArrays(int mode, IntBuffer first, IntBuffer count) {
        GLES32.glMultiDrawArrays(mode, first, count);
    }

    @Override
    public void nglMultiDrawElements(int mode, long count, int type, long indices, int drawcount) {
        GLES32.nglMultiDrawElements(mode, count, type, indices, drawcount);
    }

    @Override
    public void glPointParameterf(int pname, float param) {
        GLES32.glPointParameterf(pname, param);
    }

    @Override
    public void glPointParameteri(int pname, int param) {
        GLES32.glPointParameteri(pname, param);
    }

    @Override
    public void nglPointParameterfv(int pname, long params) {
        GLES32.nglPointParameterfv(pname, params);
    }

    @Override
    public void glPointParameterfv(int pname, FloatBuffer params) {
        GLES32.glPointParameterfv(pname, params);
    }

    @Override
    public void nglPointParameteriv(int pname, long params) {
        GLES32.nglPointParameteriv(pname, params);
    }

    @Override
    public void glPointParameteriv(int pname, IntBuffer params) {
        GLES32.glPointParameteriv(pname, params);
    }

    @Override
    public void glSecondaryColor3b(byte var0, byte var1, byte var2) {
        GLES32.glSecondaryColor3b(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3s(short var0, short var1, short var2) {
        GLES32.glSecondaryColor3s(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3i(int var0, int var1, int var2) {
        GLES32.glSecondaryColor3i(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3f(float var0, float var1, float var2) {
        GLES32.glSecondaryColor3f(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3d(double var0, double var2, double var4) {
        GLES32.glSecondaryColor3d(var0, var2, var4);
    }

    @Override
    public void glSecondaryColor3ub(byte var0, byte var1, byte var2) {
        GLES32.glSecondaryColor3ub(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3us(short var0, short var1, short var2) {
        GLES32.glSecondaryColor3us(var0, var1, var2);
    }

    @Override
    public void glSecondaryColor3ui(int var0, int var1, int var2) {
        GLES32.glSecondaryColor3ui(var0, var1, var2);
    }

    @Override
    public void nglSecondaryColor3bv(long var0) {
        GLES32.nglSecondaryColor3bv(var0);
    }

    @Override
    public void glSecondaryColor3bv(ByteBuffer v) {
        GLES32.glSecondaryColor3bv(v);
    }

    @Override
    public void nglSecondaryColor3sv(long var0) {
        GLES32.nglSecondaryColor3sv(var0);
    }

    @Override
    public void glSecondaryColor3sv(ShortBuffer v) {
        GLES32.glSecondaryColor3sv(v);
    }

    @Override
    public void nglSecondaryColor3iv(long var0) {
        GLES32.nglSecondaryColor3iv(var0);
    }

    @Override
    public void glSecondaryColor3iv(IntBuffer v) {
        GLES32.glSecondaryColor3iv(v);
    }

    @Override
    public void nglSecondaryColor3fv(long var0) {
        GLES32.nglSecondaryColor3fv(var0);
    }

    @Override
    public void glSecondaryColor3fv(FloatBuffer v) {
        GLES32.glSecondaryColor3fv(v);
    }

    @Override
    public void nglSecondaryColor3dv(long var0) {
        GLES32.nglSecondaryColor3dv(var0);
    }

    @Override
    public void glSecondaryColor3dv(DoubleBuffer v) {
        GLES32.glSecondaryColor3dv(v);
    }

    @Override
    public void nglSecondaryColor3ubv(long var0) {
        GLES32.nglSecondaryColor3ubv(var0);
    }

    @Override
    public void glSecondaryColor3ubv(ByteBuffer v) {
        GLES32.glSecondaryColor3ubv(v);
    }

    @Override
    public void nglSecondaryColor3usv(long var0) {
        GLES32.nglSecondaryColor3usv(var0);
    }

    @Override
    public void glSecondaryColor3usv(ShortBuffer v) {
        GLES32.glSecondaryColor3usv(v);
    }

    @Override
    public void nglSecondaryColor3uiv(long var0) {
        GLES32.nglSecondaryColor3uiv(var0);
    }

    @Override
    public void glSecondaryColor3uiv(IntBuffer v) {
        GLES32.glSecondaryColor3uiv(v);
    }

    @Override
    public void nglSecondaryColorPointer(int var0, int var1, int var2, long var3) {
        GLES32.nglSecondaryColorPointer(var0, var1, var2, var3);
    }

    @Override
    public void glSecondaryColorPointer(int size, int type, int stride, ByteBuffer pointer) {
        GLES32.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override
    public void glSecondaryColorPointer(int size, int type, int stride, long pointer) {
        GLES32.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override
    public void glSecondaryColorPointer(int size, int type, int stride, ShortBuffer pointer) {
        GLES32.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override
    public void glSecondaryColorPointer(int size, int type, int stride, IntBuffer pointer) {
        GLES32.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override
    public void glSecondaryColorPointer(int size, int type, int stride, FloatBuffer pointer) {
        GLES32.glSecondaryColorPointer(size, type, stride, pointer);
    }

    @Override
    public void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        GLES32.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    @Override
    public void glWindowPos2i(int var0, int var1) {
        GLES32.glWindowPos2i(var0, var1);
    }

    @Override
    public void glWindowPos2s(short var0, short var1) {
        GLES32.glWindowPos2s(var0, var1);
    }

    @Override
    public void glWindowPos2f(float var0, float var1) {
        GLES32.glWindowPos2f(var0, var1);
    }

    @Override
    public void glWindowPos2d(double var0, double var2) {
        GLES32.glWindowPos2d(var0, var2);
    }

    @Override
    public void nglWindowPos2iv(long var0) {
        GLES32.nglWindowPos2iv(var0);
    }

    @Override
    public void glWindowPos2iv(IntBuffer p) {
        GLES32.glWindowPos2iv(p);
    }

    @Override
    public void nglWindowPos2sv(long var0) {
        GLES32.nglWindowPos2sv(var0);
    }

    @Override
    public void glWindowPos2sv(ShortBuffer p) {
        GLES32.glWindowPos2sv(p);
    }

    @Override
    public void nglWindowPos2fv(long var0) {
        GLES32.nglWindowPos2fv(var0);
    }

    @Override
    public void glWindowPos2fv(FloatBuffer p) {
        GLES32.glWindowPos2fv(p);
    }

    @Override
    public void nglWindowPos2dv(long var0) {
        GLES32.nglWindowPos2dv(var0);
    }

    @Override
    public void glWindowPos2dv(DoubleBuffer p) {
        GLES32.glWindowPos2dv(p);
    }

    @Override
    public void glWindowPos3i(int var0, int var1, int var2) {
        GLES32.glWindowPos3i(var0, var1, var2);
    }

    @Override
    public void glWindowPos3s(short var0, short var1, short var2) {
        GLES32.glWindowPos3s(var0, var1, var2);
    }

    @Override
    public void glWindowPos3f(float var0, float var1, float var2) {
        GLES32.glWindowPos3f(var0, var1, var2);
    }

    @Override
    public void glWindowPos3d(double var0, double var2, double var4) {
        GLES32.glWindowPos3d(var0, var2, var4);
    }

    @Override
    public void nglWindowPos3iv(long var0) {
        GLES32.nglWindowPos3iv(var0);
    }

    @Override
    public void glWindowPos3iv(IntBuffer p) {
        GLES32.glWindowPos3iv(p);
    }

    @Override
    public void nglWindowPos3sv(long var0) {
        GLES32.nglWindowPos3sv(var0);
    }

    @Override
    public void glWindowPos3sv(ShortBuffer p) {
        GLES32.glWindowPos3sv(p);
    }

    @Override
    public void nglWindowPos3fv(long var0) {
        GLES32.nglWindowPos3fv(var0);
    }

    @Override
    public void glWindowPos3fv(FloatBuffer p) {
        GLES32.glWindowPos3fv(p);
    }

    @Override
    public void nglWindowPos3dv(long var0) {
        GLES32.nglWindowPos3dv(var0);
    }

    @Override
    public void glWindowPos3dv(DoubleBuffer p) {
        GLES32.glWindowPos3dv(p);
    }

    @Override
    public void glFogCoordfv(float[] coord) {
        GLES32.glFogCoordfv(coord);
    }

    @Override
    public void glFogCoorddv(double[] coord) {
        GLES32.glFogCoorddv(coord);
    }

    @Override
    public void glMultiDrawArrays(int mode, int[] first, int[] count) {
        GLES32.glMultiDrawArrays(mode, first, count);
    }

    @Override
    public void glPointParameterfv(int pname, float[] params) {
        GLES32.glPointParameterfv(pname, params);
    }

    @Override
    public void glPointParameteriv(int pname, int[] params) {
        GLES32.glPointParameteriv(pname, params);
    }

    @Override
    public void glSecondaryColor3sv(short[] v) {
        GLES32.glSecondaryColor3sv(v);
    }

    @Override
    public void glSecondaryColor3iv(int[] v) {
        GLES32.glSecondaryColor3iv(v);
    }

    @Override
    public void glSecondaryColor3fv(float[] v) {
        GLES32.glSecondaryColor3fv(v);
    }

    @Override
    public void glSecondaryColor3dv(double[] v) {
        GLES32.glSecondaryColor3dv(v);
    }

    @Override
    public void glSecondaryColor3usv(short[] v) {
        GLES32.glSecondaryColor3usv(v);
    }

    @Override
    public void glSecondaryColor3uiv(int[] v) {
        GLES32.glSecondaryColor3uiv(v);
    }

    @Override
    public void glWindowPos2iv(int[] p) {
        GLES32.glWindowPos2iv(p);
    }

    @Override
    public void glWindowPos2sv(short[] p) {
        GLES32.glWindowPos2sv(p);
    }

    @Override
    public void glWindowPos2fv(float[] p) {
        GLES32.glWindowPos2fv(p);
    }

    @Override
    public void glWindowPos2dv(double[] p) {
        GLES32.glWindowPos2dv(p);
    }

    @Override
    public void glWindowPos3iv(int[] p) {
        GLES32.glWindowPos3iv(p);
    }

    @Override
    public void glWindowPos3sv(short[] p) {
        GLES32.glWindowPos3sv(p);
    }

    @Override
    public void glWindowPos3fv(float[] p) {
        GLES32.glWindowPos3fv(p);
    }

    @Override
    public void glWindowPos3dv(double[] p) {
        GLES32.glWindowPos3dv(p);
    }

}