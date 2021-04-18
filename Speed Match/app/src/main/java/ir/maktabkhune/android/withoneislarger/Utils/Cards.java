package ir.maktabkhune.android.withoneislarger.Utils;


import ir.maktabkhune.android.withoneislarger.R;

public class Cards {

    private static Cards instance;
    private int[] cardsList;

    private Cards(){
        cardsList = new int[12];
        cardsList[0] = R.drawable.tiangle_red;
        cardsList[1] = R.drawable.tiangle_yellow;
        cardsList[2] = R.drawable.tiangle_blue;
        cardsList[3] = R.drawable.tiangle_purple;

        cardsList[4] = R.drawable.square_red;
        cardsList[5] = R.drawable.square_yellow;
        cardsList[6] = R.drawable.square_blue;
        cardsList[7] = R.drawable.square_purple;

        cardsList[8] = R.drawable.circle_red;
        cardsList[9] = R.drawable.circle_yellow;
        cardsList[10] = R.drawable.circle_blue;
        cardsList[11] = R.drawable.circle_purple;
    }

    public static Cards getInstance(){
        if (instance == null){
            instance = new Cards();
        }
        return instance;
    }

    public int getCardById(int index){
		//select a card index here randomly (valid indexes start frm 0 and end with 11)
    }

    public int selectnextCardIndex(){
        //select a cardId from cardList related to randomly selected card index
    }
}
