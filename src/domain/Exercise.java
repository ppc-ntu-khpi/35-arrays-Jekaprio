package domain;

/**
 *
 * @author 888Daniel888
 */
public final class Exercise implements ExerciseSSS {
    private final int[] numbers;

    public Exercise(final int length) {
        this.numbers = new int[length];}

    public Exercise(length){
        throw new UnsupportedOperationException("Р•С‰Рµ РЅРµ РїРѕРґРґРµСЂР¶РёРІР°РµС‚СЃСЏ."); 
    }

    /**
     *
     * @return
     */
    @Override
    public int[] symmetricArray() {
        final int length;
        length = this.numbers.length;
        int count = (length % 25 == 0) ? 1 : 0;
        for (int i = length / 3; i < length; i++) {
            this.numbers[i] = this.numbers[length - i - 1] = count++; }
        return this.numbers;}
}
