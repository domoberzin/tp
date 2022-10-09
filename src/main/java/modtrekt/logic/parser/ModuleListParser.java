//package modtrekt.logic.parser;
//
//import static modtrekt.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
//import static modtrekt.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//<<<<<<<< HEAD:src/main/java/modtrekt/logic/parser/TaskBookParser.java
//import modtrekt.logic.commands.AddTaskCommand;
//import modtrekt.logic.commands.Command;
//========
//import modtrekt.logic.commands.AddCommand;
//import modtrekt.logic.commands.Command;
//import modtrekt.logic.commands.DeleteCommand;
//>>>>>>>> junhao/HoJunHao2000/week-8/implement-module-commands:src/main/java/modtrekt/logic/parser/ModuleListParser.java
//import modtrekt.logic.commands.ExitCommand;
//import modtrekt.logic.commands.HelpCommand;
//import modtrekt.logic.commands.RemoveTaskCommand;
//import modtrekt.logic.parser.exceptions.ParseException;
//
///**
// * Parses user input.
// */
//<<<<<<<< HEAD:src/main/java/modtrekt/logic/parser/TaskBookParser.java
//public class TaskBookParser {
//========
//public class ModuleListParser {
//>>>>>>>> junhao/HoJunHao2000/week-8/implement-module-commands:src/main/java/modtrekt/logic/parser/ModuleListParser.java
//
//    /**
//     * Used for initial separation of command word and args.
//     */
//    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandWord>\\S+)(?<arguments>.*)");
//
//    /**
//     * Parses user input into command for execution.
//     *
//     * @param userInput full user input string
//     * @return the command based on the user input
//     * @throws ParseException if the user input does not conform the expected format
//     */
//    public Command parseCommand(String userInput) throws ParseException {
//        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
//        if (!matcher.matches()) {
//            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
//        }
//
//        final String commandWord = matcher.group("commandWord");
//        final String arguments = matcher.group("arguments");
//        switch (commandWord) {
//
//<<<<<<<< HEAD:src/main/java/modtrekt/logic/parser/TaskBookParser.java
//        case AddTaskCommand.COMMAND_WORD:
//            return new AddTaskCommandParser().parse(arguments);
//        case RemoveTaskCommand.COMMAND_WORD:
//            return new RemoveTaskCommandParser().parse(arguments);
//========
//        case AddCommand.COMMAND_WORD:
//            return new AddCommandParser().parse(arguments);
//
//        case DeleteCommand.COMMAND_WORD:
//            return new DeleteCommandParser().parse(arguments);
//
//        case ListCommand.COMMAND_WORD:
//            return new ListCommand();
//
//>>>>>>>> junhao/HoJunHao2000/week-8/implement-module-commands:src/main/java/modtrekt/logic/parser/ModuleListParser.java
//        case ExitCommand.COMMAND_WORD:
//            return new ExitCommand();
//        case HelpCommand.COMMAND_WORD:
//            return new HelpCommand();
//
//        default:
//            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
//        }
//    }
//
//}
