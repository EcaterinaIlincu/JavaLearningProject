package md.tekwill.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1 = "Perform git stash - store the uncommitted changes";
        String step2 = "Perform git checkout master to move to the local master branch";
        String step3 = "Perform git fetch command - to fetch the origin branches";
        String step4 = "Perform git pull command - to pull the origin branches";
        String step5 = "Perform git checkout -b new_branch_name command - to create and instantly move to a new branch, " +
                "that is identical to local master branch.";
        String step6 = "Add your changes that are related to the task";
        String step7 = "Review your changes and check your code before committing them";
        String step8 = "Execute git commit by using the IntelliJ interface, where you can select what changes you want to commit";
        String step9 = "Once all the changes, are committed, execute a git push command by using CTRL+ALT+K hot keys";
        String step10 = "The committed changes are pushed to an origin branch with the same name, navigate to the GitHub branch";
        String step11 = "Create a Pull Request from origin/new_branch_name into origin/master";
        String step12 = "Add the Pull Request from origin/new_branch_name into origin/master";
        String step13 = "If you collect at least 1 approval from your colleagues then merge the branch ";
        String step14 = "After that, the origin/master contains the latest changes and the origin/new_branch_name can be deleted";
        String step15 = "Do not forget that locally you are still on the new_branch_name, it`s good to move back to master";
        String step16 = "However, the local master branch does not have the latest changes, therefore perform a git fetch and git pull";


        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
        System.out.println(step16);
    }
}
