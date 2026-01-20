
public static void main(String[]args){
    TV tv =new TV();
    PC pc =new pc();
    use(tv);
    use(pc);
    public static void use(Electrical eleItem){
        eleItem.power();
    }
}
