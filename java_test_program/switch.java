class test{
    public static void main(String[] args){
        
        int number=31;
        String size;
        switch (number){
            case 29:
            size="small";
            break;
            
            case 32:
                size="medium";
                break;
            case 40:
                size="large";
                break;
            case 42:
                size="extra large";
                break;
            default:
            size="size is unkown";
            break;
       
    }
     System.out.println("Size: " + size);
}
}