package lab.cli.call.command;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class Echo {
    @ShellMethod("Apresenta uma mensagem concatenado com o valor passado como argumento")
    public String echo(@ShellOption({"-N", "--name"}) String name) {
        return String.format("Olá %s! Você está executando uma aplicação spring shell!", name);
    }
}
