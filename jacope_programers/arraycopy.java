class arraycopy {
    static void arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length) {
        if (srcPos > src.length || srcPos < 0){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException srcPos: " + srcPos);
        }

        if (destPos > dest.length || destPos < 0){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException destPos: " + destPos);
        }

        if (destPos + length > dest.length){
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException length: " + length);
        }

        if (src == null){
            throw new NullPointerException("src is null");
        }

        if (dest == null){
            throw new NullPointerException("src is null");
        }

        for (int i = 0; i < length; i++) {
            dest[destPos+i] = src[srcPos+i];
        }
    }
}
