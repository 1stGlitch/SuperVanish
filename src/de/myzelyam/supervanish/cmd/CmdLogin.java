/*
 *  This Source Code Form is subject to the terms of the Mozilla Public
 *   License, v. 2.0. If a copy of the MPL was not distributed with this
 *   file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package de.myzelyam.supervanish.cmd;

import de.myzelyam.supervanish.SuperVanish;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class CmdLogin extends SubCommand {

    public CmdLogin(SuperVanish plugin, CommandSender p, String[] args, String label) {
        super(plugin);
        if (canDo(p, CommandAction.LOGIN)) {
            Bukkit.broadcastMessage(convertString(getMsg("ReappearMessage"), p));
        }
    }
}
