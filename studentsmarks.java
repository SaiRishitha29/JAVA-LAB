class studentsmarks{
    public static void main(String[] args){
    	
        // Getting float input
        System.out.print("Enter subject1 marks: ");
        float sub_1 = input.nextFloat();
        System.out.print("Enter subject2 marks: ");
        float sub_2 = input.nextFloat();
        System.out.print("Enter subject3 marks: ");
        float sub_3 = input.nextFloat();
        System.out.print("Enter subject4 marks: ");
        float sub_4 = input.nextFloat();
        System.out.print("Enter subject5 marks: ");
        float sub_5 = input.nextFloat();
        System.out.print("Enter subject6 marks: ");
        float sub_6 = input.nextFloat();
        float sum,avg;
        sum=sub_1+sub_2+sub_3+sub_4+sub_5+sub_6;
        avg=sum/6;
    	
        // Getting double input
        System.out.print("sum of marks="+sum);
        
        System.out.println("avg of marks"+avg);
    	
        
    }
}