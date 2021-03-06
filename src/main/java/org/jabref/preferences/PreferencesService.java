package org.jabref.preferences;

import java.nio.file.Path;

import org.jabref.gui.keyboard.KeyBindingRepository;
import org.jabref.logic.journals.JournalAbbreviationPreferences;
import org.jabref.model.metadata.FilePreferences;

public interface PreferencesService {
    JournalAbbreviationPreferences getJournalAbbreviationPreferences();

    void storeKeyBindingRepository(KeyBindingRepository keyBindingRepository);

    KeyBindingRepository getKeyBindingRepository();

    void storeJournalAbbreviationPreferences(JournalAbbreviationPreferences abbreviationsPreferences);

    FilePreferences getFilePreferences();

    Path getWorkingDir();

    void setWorkingDir(Path dir);

}
