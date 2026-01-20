//演習26　インターフェース
package ennsyuu;

class PC implements Electrical{

//電源状態を保持する変数    
    private boolean powerOn;





// Electricalインターフェースの抽象メソッドを実装
    @Override
    public void power() {
        if (powerOn) {
            // 電源ON → OFFにする
            powerOn = false;
            System.out.println("PCの電源が切れました");
        } else {
            // 電源OFF → ONにする前に設定ファイルを読み込む
            System.out.println("設定ファイルを読み込んでいます");
            powerOn = true;
            System.out.println("PCの電源が入りました");
        }
    }





    public boolean isPowerOn() {
        return powerOn;
    }





    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

}
