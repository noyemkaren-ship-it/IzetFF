package org.example;

public class Auto {
    public static String get(String text) {
        text = text.strip();
        if (text.startsWith("h1 ")) {
            String value = text.substring(3).strip();
            return """
                    h1 {
                      font-weight: 700;
                      letter-spacing: -0.04em;
                      line-height: 1.1;
                      color: var(--text-primary);
                      margin-bottom: 0.5em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("h2 ")) {
            String value = text.substring(3).strip();
            return """
                    h2 {
                      font-weight: 600;
                      letter-spacing: -0.03em;
                      line-height: 1.2;
                      color: var(--text-primary);
                      margin-bottom: 0.4em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("h3 ")) {
            String value = text.substring(3).strip();
            return """
                    h3 {
                      font-weight: 600;
                      letter-spacing: -0.02em;
                      line-height: 1.3;
                      color: var(--text-primary);
                      margin-bottom: 0.3em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("h4 ")) {
            String value = text.substring(3).strip();
            return """
                    h4 {
                      font-weight: 600;
                      letter-spacing: -0.01em;
                      line-height: 1.4;
                      color: var(--text-primary);
                      margin-bottom: 0.25em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("h5 ")) {
            String value = text.substring(3).strip();
            return """
                    h5 {
                      font-weight: 600;
                      line-height: 1.4;
                      color: var(--text-primary);
                      margin-bottom: 0.2em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("h6 ")) {
            String value = text.substring(3).strip();
            return """
                    h6 {
                      font-weight: 600;
                      line-height: 1.4;
                      color: var(--text-muted);
                      text-transform: uppercase;
                      letter-spacing: 0.05em;
                      margin-bottom: 0.2em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("p ")) {
            String value = text.substring(2).strip();
            return """
                    p {
                      font-weight: 400;
                      line-height: 1.7;
                      color: var(--text-secondary);
                      margin-bottom: 1.2em;
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("a ")) {
            String value = text.substring(2).strip();
            return """
                    a {
                      color: var(--text-primary);
                      text-decoration: none;
                      transition: color 0.3s ease;
                      position: relative;
                      font-size: %s;
                    }
                    
                    a::after {
                      content: '';
                      position: absolute;
                      bottom: -2px;
                      left: 0;
                      width: 0;
                      height: 1px;
                      background: var(--accent);
                      transition: width 0.3s ease;
                    }
                    
                    a:hover::after {
                      width: 100%;
                    }
                    """.formatted(value);
        } else if (text.startsWith("img ")) {
            String value = text.substring(4).strip();
            return """
                    img {
                      max-width: 100%;
                      height: auto;
                      display: block;
                      border-radius: var(--radius-md);
                      width: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("button ")) {
            String value = text.substring(7).strip();
            return """
                    button {
                      display: inline-flex;
                      align-items: center;
                      justify-content: center;
                      gap: 8px;
                      padding: 12px 28px;
                      background: var(--bg-elevated);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: 8px;
                      font-weight: 500;
                      cursor: pointer;
                      transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                      backdrop-filter: blur(10px);
                      user-select: none;
                      font-size: %s;
                    }
                    
                    button:hover {
                      border-color: var(--border-light);
                      transform: translateY(-1px);
                      box-shadow: var(--shadow-sm);
                    }
                    
                    button:active {
                      transform: translateY(0) scale(0.98);
                    }
                    """.formatted(value);
        } else if (text.startsWith("li ")) {
            String value = text.substring(3).strip();
            return """
                    li {
                      position: relative;
                      padding-left: 24px;
                      line-height: 1.7;
                      color: var(--text-secondary);
                      margin-bottom: 0.5em;
                      font-size: %s;
                    }
                    
                    li::before {
                      content: '';
                      position: absolute;
                      left: 0;
                      top: 10px;
                      width: 6px;
                      height: 6px;
                      background: var(--accent);
                      border-radius: 50%;
                      opacity: 0.5;
                    }
                    """.formatted(value);
        } else if (text.startsWith("blockquote ")) {
            String value = text.substring(11).strip();
            return """
                    blockquote {
                      border-left: 3px solid var(--accent);
                      padding: 16px 24px;
                      margin: 1.5em 0;
                      background: var(--bg-elevated);
                      border-radius: 0 var(--radius-sm) var(--radius-sm) 0;
                      font-style: italic;
                      color: var(--text-secondary);
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("code ")) {
            String value = text.substring(5).strip();
            return """
                    code {
                      background: var(--bg-elevated);
                      color: var(--accent);
                      padding: 2px 8px;
                      border-radius: 4px;
                      font-family: 'JetBrains Mono', 'Fira Code', monospace;
                      border: 1px solid var(--border);
                      font-size: %s;
                    }
                    """.formatted(value);
        } else if (text.startsWith("input ")) {
            String value = text.substring(6).strip();
            return """
                    input {
                      width: 100%;
                      padding: 12px 16px;
                      background: var(--bg-secondary);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-sm);
                      font-family: inherit;
                      transition: all 0.3s ease;
                      outline: none;
                      font-size: %s;
                    }
                    
                    input:focus {
                      border-color: var(--border-light);
                      box-shadow: 0 0 0 3px rgba(255, 255, 255, 0.03);
                      background: var(--bg-elevated);
                    }
                    
                    input::placeholder {
                      color: var(--text-muted);
                    }
                    """.formatted(value);
        } else {
            return "ERROR: I dont know -> " + text;
        }
    }
}