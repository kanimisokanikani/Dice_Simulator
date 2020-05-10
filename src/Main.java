public class Main {
    public static void main(String[] args){

        /////////////
        // 変数作成 //
        /////////////

        long Number_of_Trials;       //試行回数


        ///////////////////
        // 軽量級 Lv1から //
        ///////////////////

        long Lv1_Light_Class_Lv1_Number_1_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで 1 が出たら記録する変数
        long Lv1_Light_Class_Lv1_Number_2_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで 2 が出たら記録する変数
        long Lv1_Light_Class_Lv1_Number_3_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで 3 が出たら記録する変数
        long Lv1_Light_Class_Lv1_Number_4_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで 4 が出たら記録する変数
        long Lv1_Light_Class_Lv1_Number_5_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで 5 が出たら記録する変数
        long Lv1_Light_Class_Lv1_Level_UP_Record = 0;        //軽量級Lv1スタートの Lv1ダイスで レベルUP が出たら記録する変数

        long Lv1_Light_Class_Lv2_Number_1_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 1 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Number_2_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 2 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Number_3_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 3 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Number_4_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 4 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Number_5_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 5 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Number_6_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで 6 が出たら記録する変数
        long Lv1_Light_Class_Lv2_Level_UP_Record = 0;        //軽量級Lv1スタートの Lv2ダイスで レベルUP が出たら記録する変数
        long Lv1_Light_Class_Lv2_Level_DOWN_Record = 0;      //軽量級Lv1スタートの Lv2ダイスで レベルDOWN が出たら記録する変数

        long Lv1_Light_Class_Lv3_Number_1_Record = 0;        //軽量級Lv1スタートの Lv3ダイスで 1 が出たら記録する変数
        long Lv1_Light_Class_Lv3_Number_2_Record = 0;        //軽量級Lv1スタートの Lv3ダイスで 2 が出たら記録する変数
        long Lv1_Light_Class_Lv3_Number_3_Record = 0;        //軽量級Lv1スタートの Lv3ダイスで 3 が出たら記録する変数
        long Lv1_Light_Class_Lv3_Number_4_Record = 0;        //軽量級Lv1スタートの Lv3ダイスで 4 が出たら記録する変数
        long Lv1_Light_Class_Lv3_Number_5_Record = 0;        //軽量級Lv1スタートの Lv3ダイスで 5 が出たら記録する変数
        long Lv1_Light_Class_Lv3_Level_DOWN_Record = 0;      //軽量級Lv1スタートの Lv3ダイスで レベルDOWN が出たら記録する変数


        ////////////////
        // 試行回数入力 //
        ////////////////

        System.out.println("試行回数を入力してください (回数が多ければ多いほど精度が上がります)"); //全ての階級共通の回数です

        Number_of_Trials = new java.util.Scanner(System.in).nextLong();


        /////////////////
        // 軽量級 Lv1から
        /////////////////

        for (int i = 0; i < Number_of_Trials; i++) { //試行回数分ループ


            //////////////
            // Lv1ダイス //
            //////////////

            Lv1_Dice_Repeat: while (true) { //DOWN を引いた時に使用するラベル  continue Lv1_Dice_Repeat;で戻れる

                int Lv1_Dice = new java.util.Random().nextInt(12); //Lv1のダイスを振る (12面ダイス)

                switch (Lv1_Dice) {
                    case 0: // 出目 1
                    case 1:
                    case 2:
                    case 3:
                        Lv1_Light_Class_Lv1_Number_1_Record ++; //Lv1の1が出たことを記録
                        break Lv1_Dice_Repeat; //試行終わり


                    case 4: // 出目 2
                        Lv1_Light_Class_Lv1_Number_2_Record ++; //Lv1の2が出たことを記録
                        break Lv1_Dice_Repeat; //試行終わり


                    case 5: // 出目 3
                    case 6:
                        Lv1_Light_Class_Lv1_Number_3_Record ++; //Lv1の3が出たことを記録
                        break Lv1_Dice_Repeat; //試行終わり


                    case 7: // 出目 4
                        Lv1_Light_Class_Lv1_Number_4_Record ++; //Lv1の4が出たことを記録
                        break Lv1_Dice_Repeat; //試行終わり


                    case 8: // 出目 5
                    case 9:
                        Lv1_Light_Class_Lv1_Number_5_Record ++; //Lv1の5が出たことを記録
                        break Lv1_Dice_Repeat; //試行終わり


                    case 10: // 出目 UP
                    case 11:
                        Lv1_Light_Class_Lv1_Level_UP_Record ++; //Lv1のUPが出たことを記録


                        //////////////
                        // Lv2ダイス //
                        //////////////

                        Lv2_Dice_Repeat: while (true) { //UP or DOWN を引いた時に使用するラベル  continue Lv2_Dice_Repeat;で戻れる

                            int Lv2_Dice = new java.util.Random().nextInt(12); //Lv2のダイスを振る (12面ダイス)

                            switch (Lv2_Dice) {
                                case 0: // 出目 1
                                case 1:
                                    Lv1_Light_Class_Lv2_Number_1_Record ++; //Lv2の1が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 2: // 出目 2
                                case 3:
                                case 4:
                                    Lv1_Light_Class_Lv2_Number_2_Record ++; //Lv2の2が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 5: // 出目 3
                                    Lv1_Light_Class_Lv2_Number_3_Record ++; //Lv2の3が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 6: // 出目 4
                                case 7:
                                    Lv1_Light_Class_Lv2_Number_4_Record ++; //Lv2の4が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 8: // 出目 5
                                    Lv1_Light_Class_Lv2_Number_5_Record ++; //Lv2の5が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 9: // 出目 6
                                    Lv1_Light_Class_Lv2_Number_6_Record ++; //Lv2の6が出たことを記録
                                    break Lv1_Dice_Repeat; //試行終わり


                                case 10: // 出目 DOWN
                                    Lv1_Light_Class_Lv2_Level_DOWN_Record ++; //Lv2のDOWNが出たことを記録
                                    continue Lv1_Dice_Repeat; //Lv1ダイスに移行


                                case 11: // 出目 UP
                                    Lv1_Light_Class_Lv2_Level_UP_Record ++; //Lv2のUPが出たことを記録


                                    //////////////
                                    // Lv3ダイス //
                                    //////////////

                                    int Lv3_Dice = new java.util.Random().nextInt(12); //Lv3のダイスを振る (12面ダイス)

                                    switch (Lv3_Dice) {
                                        case 0: // 出目 1
                                        case 1:
                                            Lv1_Light_Class_Lv3_Number_1_Record ++; //Lv3の1が出たことを記録
                                            break Lv1_Dice_Repeat; //試行終わり


                                        case 2: // 出目 2
                                            Lv1_Light_Class_Lv3_Number_2_Record ++; //Lv3の2が出たことを記録
                                            break Lv1_Dice_Repeat; //試行終わり


                                        case 3: // 出目 3
                                            Lv1_Light_Class_Lv3_Number_3_Record ++; //Lv3の3が出たことを記録
                                            break Lv1_Dice_Repeat; //試行終わり


                                        case 4: // 出目 4
                                        case 5:
                                            Lv1_Light_Class_Lv3_Number_4_Record ++; //Lv3の4が出たことを記録
                                            break Lv1_Dice_Repeat; //試行終わり


                                        case 6: // 出目 5
                                        case 7:
                                        case 8:
                                            Lv1_Light_Class_Lv3_Number_5_Record ++; //Lv3の5が出たことを記録
                                            break Lv1_Dice_Repeat; //試行終わり


                                        case 9: // 出目 DOWN
                                        case 10:
                                        case 11:
                                            Lv1_Light_Class_Lv3_Level_DOWN_Record ++; //Lv3のDOWNが出たことを記録
                                            continue Lv2_Dice_Repeat; //試行終わり
                                    }
                            }
                        }
                }
            }
        }
        System.out.println(Lv1_Light_Class_Lv1_Number_1_Record);
        System.out.println(Lv1_Light_Class_Lv1_Number_2_Record);
        System.out.println(Lv1_Light_Class_Lv1_Number_3_Record);
        System.out.println(Lv1_Light_Class_Lv1_Number_4_Record);
        System.out.println(Lv1_Light_Class_Lv1_Number_5_Record);
        System.out.println(Lv1_Light_Class_Lv1_Level_UP_Record);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(Lv1_Light_Class_Lv2_Number_1_Record);
        System.out.println(Lv1_Light_Class_Lv2_Number_2_Record);
        System.out.println(Lv1_Light_Class_Lv2_Number_3_Record);
        System.out.println(Lv1_Light_Class_Lv2_Number_4_Record);
        System.out.println(Lv1_Light_Class_Lv2_Number_5_Record);
        System.out.println(Lv1_Light_Class_Lv2_Number_6_Record);
        System.out.println(Lv1_Light_Class_Lv2_Level_UP_Record);
        System.out.println(Lv1_Light_Class_Lv2_Level_DOWN_Record);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(Lv1_Light_Class_Lv3_Number_1_Record);
        System.out.println(Lv1_Light_Class_Lv3_Number_2_Record);
        System.out.println(Lv1_Light_Class_Lv3_Number_3_Record);
        System.out.println(Lv1_Light_Class_Lv3_Number_4_Record);
        System.out.println(Lv1_Light_Class_Lv3_Number_5_Record);
        System.out.println(Lv1_Light_Class_Lv3_Level_DOWN_Record);
    }
}
