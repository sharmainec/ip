package commands;

import tasks.Task;
import viper.Storage;
import viper.TaskList;
import viper.Ui;

import java.io.IOException;

/**
 * Marks task specified by user as done, using index.
 */
public class DoneCommand extends Command {
    String t;
    String[] s;
    int index;
    Task curr;
    
    public DoneCommand(String t) {
        this.t = t;
        this.s = t.split(" ", 2);
        index = Integer.parseInt(s[1]);
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws IOException {
        if (index < tasks.getSize() + 1) {
            curr = tasks.getTask(index - 1);
            storage.doneTask(curr);
            tasks.doneTask(index - 1);
            String[] msg = {"Good job on completing your task!!!", "I've marked this task as done:", curr.toString()};
            ui.showMessage(msg);
        } else {
            ui.showInvalidIndexError();
        }
    }

    @Override
    public boolean isExit() {
        return false;
    }

}
