
import java.awt.event.*;//This is part of the import that lets me close the page and go to the next one using the Close method
import java.awt.*;//This is part of the import that lets me close the page and go to the next one using the Close method

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Blake Hadaway
 * January 25th, This section will test the users knowledge of the rules of basketball
 */
public class ruleQuestons extends javax.swing.JFrame {

    int quesNum = 1;// this is for the cases so that i can add 1 to this if i want the next case to open/excute

    public void closePage() {// this is the close page method
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);// this is the line of code that will close the page 
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);// this is accessing the tool kit to be able to close the page
    }

    public void startUp() {// this is the start up method  
        ans1Label.setText(arrayAnsSet1[0]); // seting the first label the first possible answer
        ans2Label.setText(arrayAnsSet1[1]); // setting the second label the second possible answer
        ans3Label.setText(arrayAnsSet1[2]); //setting the third label the third possble answer
        ans4Label.setText(arrayAnsSet1[3]); // setting the fourth label the fourth possible answer
        questionBox.setText(arrayQue[0]); // setting the question box to the first question
    }

    String[] arrayAnsSet1 = new String[4]; // this is an array that will hold all the answers for the first question
    String[] arrayAnsSet2 = new String[4]; // this is an array that will hold all the answers for the second question
    String[] arrayAnsSet3 = new String[4]; // this is an array that will hold all the answers for the third question
    String[] arrayAnsSet4 = new String[4]; // this is an array that will hold all the answers for the fourth question
    String[] arrayAnsSet5 = new String[4]; // this is an array that will hold all the answers for the fifth question
    String[] arrayAnsSet6 = new String[4]; // this is an array that will hold all the answers for the sixth question
    String[] arrayQue = new String[6]; // this is an array that will hold all of the questions for this section

    /**
     * Creates new form ruleQuestons
     */
    public ruleQuestons() {
        initComponents();

        arrayQue[0] = "If the blue team gets a travel call called against them, whos ball is it?";//Question 1
        arrayQue[1] = "If the red team gets called for a double dribble, whos ball is it?";//Question 2
        arrayQue[2] = "If the blue team gets called for a charge, whos ball is it?";//Question 3
        arrayQue[3] = "If a jump ball is called, how do you determine whos ball it is?";//Question 4
        arrayQue[4] = "How many seconds does the player have on an in bound play?";//Question 5
        arrayQue[5] = "How long does a team have to get the ball across half?";//Question 6

        arrayAnsSet1[0] = "1. Red team ball";// Possible answer 1 for question 1
        arrayAnsSet1[1] = "2. Ref decides";// Possible answer 2 for question 1
        arrayAnsSet1[2] = "3. Check jump ball arrow";// Possible answer 3 for question 1
        arrayAnsSet1[3] = "4. Blue team ball";// Possible answer 4 for question 1

        arrayAnsSet2[0] = "1. Red team Ball";// Possible answer 1 for question 2
        arrayAnsSet2[1] = "2. Ref decides";// Possible answer 2 for question 2
        arrayAnsSet2[2] = "3. Blue team ball";// Possible answer 3 for question 2
        arrayAnsSet2[3] = "4. Crowd decides";// Possible answer 4 for question 2

        arrayAnsSet3[0] = "1. Ref Checks whos fault";// Possible answer 1 for question 3
        arrayAnsSet3[1] = "2. Red team ball";// Possible answer 2 for question 3
        arrayAnsSet3[2] = "3. Blue team ball";// Possible answer 3 for question 3
        arrayAnsSet3[3] = "4. Go to David Dennis";// Possible answer 4 for question 3

        arrayAnsSet4[0] = "1. The way the arrows facing";// Possible answer 1 for question 4
        arrayAnsSet4[1] = "2. Red team ball";// Possible answer 2 for question 4
        arrayAnsSet4[2] = "3. Blue team ball";// Possible answer 3 for question 4
        arrayAnsSet4[3] = "4. Ask Mrs. Marsh";// Possible answer 4 for question 4

        arrayAnsSet5[0] = "1. Ask a smart person";// Possible answer 1 for question 5
        arrayAnsSet5[1] = "2. 8 Seconds";// Possible answer 2 for question 5
        arrayAnsSet5[2] = "3. 5 Seconds";// Possible answer 3 for question 5
        arrayAnsSet5[3] = "4. 3 Seconds";// Possible answer 4 for question 5

        arrayAnsSet6[0] = "1. 7 Seconds";// Possible answer 1 for question 6
        arrayAnsSet6[1] = "2. 10 Seconds";// Possible answer 2 for question 6
        arrayAnsSet6[2] = "3. 2 Seconds";// Possible answer 3 for question 6
        arrayAnsSet6[3] = "4. 5 Seconds";// Possible answer 4 for question 6

        startUp();// this is calling the start up method 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        questionBox = new javax.swing.JTextField();
        ansBox = new javax.swing.JTextField();
        ans1Label = new javax.swing.JLabel();
        ans2Label = new javax.swing.JLabel();
        ans4Label = new javax.swing.JLabel();
        ans3Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outputLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rule Violation Questions");

        questionBox.setEditable(false);
        questionBox.setBackground(new java.awt.Color(0, 0, 0));
        questionBox.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        questionBox.setForeground(new java.awt.Color(255, 255, 255));
        questionBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ansBox.setBackground(new java.awt.Color(0, 0, 0));
        ansBox.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ansBox.setForeground(new java.awt.Color(255, 255, 255));
        ansBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansBoxActionPerformed(evt);
            }
        });

        ans1Label.setBackground(new java.awt.Color(0, 0, 0));
        ans1Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans1Label.setForeground(new java.awt.Color(255, 255, 255));

        ans2Label.setBackground(new java.awt.Color(0, 0, 0));
        ans2Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans2Label.setForeground(new java.awt.Color(255, 255, 255));

        ans4Label.setBackground(new java.awt.Color(0, 0, 0));
        ans4Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans4Label.setForeground(new java.awt.Color(255, 255, 255));

        ans3Label.setBackground(new java.awt.Color(0, 0, 0));
        ans3Label.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ans3Label.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer Here");

        outputLabel.setBackground(new java.awt.Color(0, 0, 0));
        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        outputLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        backButton.setBackground(new java.awt.Color(0, 0, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back To Title Page");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ans1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(ansBox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ans4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backButton))
                                .addGap(10, 10, 10))
                            .addComponent(ans3Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(questionBox)
                    .addComponent(outputLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(questionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ans1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ans3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91)
                        .addComponent(ans2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ans4Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ansBox, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(33, 33, 33)
                .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ansBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansBoxActionPerformed
        String answer; //creating string variable named answer
        answer = ansBox.getText();//setting answer to what the user inputs
        ansBox.setText("");// resets the user input box for the next answer

        switch (quesNum) {// this is the switch stament that is used to change questions
            case 1:// this is the first case for the first questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    quesNum++;// adds one to quesNum variable 
                    questionBox.setText(arrayQue[1]); //sets The question box to the next Question
                    outputLabel.setText("");// sets the output label to nothing so that the wrong message isn't still there
                    ans1Label.setText(arrayAnsSet2[0]);// sets the first possible answer box to the next possible answer
                    ans2Label.setText(arrayAnsSet2[1]);// sets the second possible answer box to the next possible answer
                    ans3Label.setText(arrayAnsSet2[2]);// sets the third possible answer box to the next possible answer
                    ans4Label.setText(arrayAnsSet2[3]);// sets the fourth possible answer box to the next possible answer
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans2Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans3Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case
            case 2:// this is the 2nd case for the 2nd questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans1Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans2Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    quesNum++;// adds one to quesNum variable 
                    questionBox.setText(arrayQue[2]); //sets The question box to the next Question
                    outputLabel.setText("");// sets the output label to nothing so that the wrong message isn't still there
                    ans1Label.setText(arrayAnsSet3[0]);// sets the first possible answer box to the next possible answer
                    ans2Label.setText(arrayAnsSet3[1]);// sets the second possible answer box to the next possible answer
                    ans3Label.setText(arrayAnsSet3[2]);// sets the third possible answer box to the next possible answer
                    ans4Label.setText(arrayAnsSet3[3]);// sets the fourth possible answer box to the next possible answer
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case

            case 3:// this is the 3rd case for the 3rd questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans1Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    quesNum++;// adds one to quesNum variable 
                    questionBox.setText(arrayQue[3]); //sets The question box to the next Question
                    outputLabel.setText("");// sets the output label to nothing so that the wrong message isn't still there
                    ans1Label.setText(arrayAnsSet4[0]);// sets the first possible answer box to the next possible answer
                    ans2Label.setText(arrayAnsSet4[1]);// sets the second possible answer box to the next possible answer
                    ans3Label.setText(arrayAnsSet4[2]);// sets the third possible answer box to the next possible answer
                    ans4Label.setText(arrayAnsSet4[3]);// sets the fourth possible answer box to the next possible answer
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans3Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case

            case 4:// this is the 4th case for the 4th questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    quesNum++;// adds one to quesNum variable 
                    questionBox.setText(arrayQue[4]); //sets The question box to the next Question
                    outputLabel.setText("");// sets the output label to nothing so that the wrong message isn't still there
                    ans1Label.setText(arrayAnsSet5[0]);// sets the first possible answer box to the next possible answer
                    ans2Label.setText(arrayAnsSet5[1]);// sets the second possible answer box to the next possible answer
                    ans3Label.setText(arrayAnsSet5[2]);// sets the third possible answer box to the next possible answer
                    ans4Label.setText(arrayAnsSet5[3]);// sets the fourth possible answer box to the next possible answer
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans2Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans3Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case

            case 5:// this is the 5th case for the 5th questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans1Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans2Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    quesNum++;// adds one to quesNum variable 
                    questionBox.setText(arrayQue[5]); //sets The question box to the next Question
                    outputLabel.setText("");// sets the output label to nothing so that the wrong message isn't still there
                    ans1Label.setText(arrayAnsSet6[0]);// sets the first possible answer box to the next possible answer
                    ans2Label.setText(arrayAnsSet6[1]);// sets the second possible answer box to the next possible answer
                    ans3Label.setText(arrayAnsSet6[2]);// sets the third possible answer box to the next possible answer
                    ans4Label.setText(arrayAnsSet6[3]);// sets the fourth possible answer box to the next possible answer
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case

            case 6:// this is the 6th case for the 6th questions
                if (answer.equals("1")) {// if the user inputs 1, this will excute 
                    closePage();// calling the close method 
                    afterRuleV s = new afterRuleV();// opening the next page
                    s.setVisible(true);//  setting the next page to be visable to the user
                } else if (answer.equals("2")) {// if the user inputs 2, this will excute 
                    outputLabel.setText("Wrong! Keep Trying!"); //outputs a message saying to the user that he got the question wrong
                    ans2Label.setText("");// sets the answer box that they chose to nothing 
                } else if (answer.equals("3")) {// if the user inputs 3, this will excute
                    outputLabel.setText("Wrong! Try again!");//outputs a message saying to the user that he got the question wrong
                    ans3Label.setText("");// sets the answer box that they chose to nothing
                } else if (answer.equals("4")) {// if the user inputs 4, this will excute
                    outputLabel.setText("Oops wrong! Keep going!");//outputs a message saying to the user that he got the question wrong
                    ans4Label.setText("");// sets the answer box that they chose to nothing 
                } else {// if all other if or else if statments aren't true, this will excute
                    outputLabel.setText("Please enter a number between 1-4 to answer.");//sets the output label to the error message
                }
                break;// ends the case

        }


    }//GEN-LAST:event_ansBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        closePage(); //calling the close method
        TitlePage s = new TitlePage();// opening the title page
        s.setVisible(true);// setting the next page to be visble for the user
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ruleQuestons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ruleQuestons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ruleQuestons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ruleQuestons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ruleQuestons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ans1Label;
    private javax.swing.JLabel ans2Label;
    private javax.swing.JLabel ans3Label;
    private javax.swing.JLabel ans4Label;
    private javax.swing.JTextField ansBox;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JTextField questionBox;
    // End of variables declaration//GEN-END:variables
}
