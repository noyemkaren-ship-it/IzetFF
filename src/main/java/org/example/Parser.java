package org.example;

public class Parser {
    public static String get(String tag) {
        tag = tag.strip();
        if (tag.equals("h1")) {
            return """
                    h1 {
                      font-size: clamp(2.5rem, 6vw, 5rem);
                      font-weight: 700;
                      letter-spacing: -0.04em;
                      line-height: 1.1;
                      color: var(--text-primary);
                      margin-bottom: 0.5em;
                    }""";
        } else if (tag.equals("h2")) {
            return """
                    h2 {
                      font-size: clamp(1.8rem, 4vw, 2.8rem);
                      font-weight: 600;
                      letter-spacing: -0.03em;
                      line-height: 1.2;
                      color: var(--text-primary);
                      margin-bottom: 0.4em;
                    }""";
        } else if (tag.equals("h3")) {
            return """
                    h3 {
                      font-size: clamp(1.3rem, 3vw, 1.8rem);
                      font-weight: 600;
                      letter-spacing: -0.02em;
                      line-height: 1.3;
                      color: var(--text-primary);
                      margin-bottom: 0.3em;
                    }""";
        } else if (tag.equals("p")) {
            return """
                    p {
                      font-size: 1rem;
                      font-weight: 400;
                      line-height: 1.7;
                      color: var(--text-secondary);
                      margin-bottom: 1.2em;
                    }""";
        } else if (tag.equals("ul")) {
            return """
                    ul {
                      list-style: none;
                      padding-left: 0;
                      margin-bottom: 1.5em;
                    }""";
        } else if (tag.equals("li")) {
            return """
                    li {
                      position: relative;
                      padding-left: 24px;
                      font-size: 1rem;
                      line-height: 1.7;
                      color: var(--text-secondary);
                      margin-bottom: 0.5em;
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
                    }""";
        } else if (tag.equals("img")) {
            return """
                    img {
                      max-width: 100%;
                      height: auto;
                      display: block;
                      border-radius: var(--radius-md);
                    }""";
        } else if (tag.equals("a")) {
            return """
                    a {
                      color: var(--text-primary);
                      text-decoration: none;
                      transition: color 0.3s ease;
                      position: relative;
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
                    }""";
        } else if (tag.equals("button")) {
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
                      font-size: 0.95rem;
                      font-weight: 500;
                      cursor: pointer;
                      transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                      backdrop-filter: blur(10px);
                      user-select: none;
                    }
                    
                    button:hover {
                      border-color: var(--border-light);
                      transform: translateY(-1px);
                      box-shadow: var(--shadow-sm);
                    }
                    
                    button:active {
                      transform: translateY(0) scale(0.98);
                    }""";
        } else {
            return "ERROR i dont know: " + tag;
        }
    }
    public static String getavatar(String ava) {
        if (ava.contains("left bleck")) {
            return """
            :root {
              --bg-primary: #050505;
              --bg-secondary: #0a0a0a;
              --bg-elevated: #111111;
              --bg-glass: rgba(10, 10, 10, 0.8);
              --text-primary: #f5f5f5;
              --text-secondary: #a0a0a0;
              --text-muted: #505050;
              --accent: #ffffff;
              --accent-soft: #e0e0e0;
              --accent-glow: #333333;
              --border: #1a1a1a;
              --border-light: #252525;
              --border-focus: #444444;
              --shadow-sm: 0 2px 8px rgba(0, 0, 0, 0.8);
              --shadow-md: 0 8px 40px rgba(0, 0, 0, 0.9);
              --shadow-glow: 0 0 40px rgba(255, 255, 255, 0.02);
              --shadow-button: 0 0 0 0 rgba(255, 255, 255, 0);
              --radius-sm: 6px;
              --radius-md: 12px;
              --radius-lg: 20px;
              --radius-xl: 28px;
              --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-slow: 0.6s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-bounce: 0.4s cubic-bezier(0.34, 1.56, 0.64, 1);
              --font-mono: 'JetBrains Mono', 'Fira Code', 'SF Mono', monospace;
            }
            
            *,
            *::before,
            *::after {
              margin: 0;
              padding: 0;
              box-sizing: border-box;
            }
            
            html {
              scroll-behavior: smooth;
              -webkit-font-smoothing: antialiased;
              -moz-osx-font-smoothing: grayscale;
              font-size: 16px;
            }
            
            body {
              font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
              background: var(--bg-primary);
              color: var(--text-primary);
              line-height: 1.6;
              min-height: 100vh;
              display: flex;
              flex-direction: column;
              align-items: flex-start;
              background-image:
                radial-gradient(ellipse at 15% 20%, rgba(40, 40, 40, 0.2) 0%, transparent 50%),
                radial-gradient(ellipse at 85% 80%, rgba(20, 20, 20, 0.15) 0%, transparent 50%),
                radial-gradient(ellipse at 50% 50%, rgba(0, 0, 0, 0.3) 0%, transparent 100%);
              background-attachment: fixed;
            }
            
            .container {
              max-width: 680px;
              width: 100%;
              margin-left: 0;
              margin-right: auto;
              padding: 80px 48px;
            }
            
            @media (max-width: 768px) {
              .container {
                padding: 40px 24px;
              }
            }
            
            h1, h2, h3, h4, h5, h6 {
              font-weight: 700;
              letter-spacing: -0.04em;
              color: var(--text-primary);
              text-align: left;
              line-height: 1.15;
            }
            
            h1 {
              font-size: clamp(2.8rem, 6vw, 4.5rem);
              margin-bottom: 0.3em;
              letter-spacing: -0.05em;
              background: linear-gradient(135deg, #ffffff 0%, #888888 50%, #cccccc 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            h2 {
              font-size: clamp(1.8rem, 4vw, 2.6rem);
              margin-bottom: 0.4em;
              margin-top: 1.2em;
              color: var(--text-primary);
            }
            
            h3 {
              font-size: clamp(1.3rem, 3vw, 1.6rem);
              margin-bottom: 0.35em;
              margin-top: 1em;
              color: var(--accent-soft);
            }
            
            h4 {
              font-size: clamp(1.1rem, 2.5vw, 1.25rem);
              margin-bottom: 0.3em;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.08em;
            }
            
            h5 {
              font-size: 1rem;
              margin-bottom: 0.25em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.1em;
            }
            
            h6 {
              font-size: 0.8rem;
              margin-bottom: 0.2em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.15em;
            }
            
            p {
              font-size: 1.05rem;
              line-height: 1.75;
              color: var(--text-secondary);
              text-align: left;
              margin-bottom: 1.5em;
              max-width: 580px;
            }
            
            p.lead {
              font-size: 1.25rem;
              line-height: 1.6;
              color: var(--text-primary);
              font-weight: 400;
            }
            
            p.small {
              font-size: 0.85rem;
              color: var(--text-muted);
            }
            
            a {
              color: var(--accent);
              text-decoration: none;
              transition: all var(--transition);
              position: relative;
              font-weight: 500;
            }
            
            a::after {
              content: '';
              position: absolute;
              bottom: -3px;
              left: 0;
              width: 0;
              height: 2px;
              background: var(--accent);
              transition: width var(--transition);
              border-radius: 1px;
            }
            
            a:hover {
              color: var(--accent-soft);
            }
            
            a:hover::after {
              width: 100%;
            }
            
            a:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 4px;
              border-radius: 2px;
            }
            
            button, .btn {
              display: inline-flex;
              align-items: center;
              justify-content: flex-start;
              gap: 10px;
              padding: 14px 32px;
              background: var(--bg-elevated);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 0.95rem;
              font-weight: 500;
              cursor: pointer;
              transition: all var(--transition);
              backdrop-filter: blur(16px);
              -webkit-backdrop-filter: blur(16px);
              user-select: none;
              position: relative;
              overflow: hidden;
              text-align: left;
            }
            
            button::before, .btn::before {
              content: '';
              position: absolute;
              inset: 0;
              background: linear-gradient(135deg, rgba(255,255,255,0.05) 0%, transparent 100%);
              opacity: 0;
              transition: opacity var(--transition);
            }
            
            button:hover, .btn:hover {
              background: var(--border);
              border-color: var(--border-light);
              transform: translateY(-2px);
              box-shadow: var(--shadow-sm);
            }
            
            button:hover::before, .btn:hover::before {
              opacity: 1;
            }
            
            button:active, .btn:active {
              transform: translateY(0) scale(0.97);
              transition: all 0.1s ease;
            }
            
            button:focus-visible, .btn:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 3px;
            }
            
            .btn-primary {
              background: var(--accent);
              color: #050505;
              border-color: var(--accent);
              font-weight: 600;
              letter-spacing: 0.01em;
            }
            
            .btn-primary:hover {
              background: #d0d0d0;
              border-color: #d0d0d0;
              color: #000000;
              box-shadow: 0 0 40px rgba(255, 255, 255, 0.15);
              transform: translateY(-3px);
            }
            
            .btn-outline {
              background: transparent;
              border: 2px solid var(--border-light);
            }
            
            .btn-outline:hover {
              border-color: var(--accent);
              background: transparent;
            }
            
            .btn-small {
              padding: 8px 18px;
              font-size: 0.85rem;
              border-radius: var(--radius-sm);
            }
            
            .btn-large {
              padding: 18px 40px;
              font-size: 1.1rem;
              border-radius: var(--radius-md);
            }
            
            ul, ol {
              list-style: none;
              padding-left: 0;
              margin-bottom: 2em;
              max-width: 580px;
            }
            
            li {
              position: relative;
              padding-left: 28px;
              font-size: 1.05rem;
              line-height: 1.7;
              color: var(--text-secondary);
              margin-bottom: 0.6em;
              text-align: left;
              transition: color var(--transition);
            }
            
            li:hover {
              color: var(--text-primary);
            }
            
            li::before {
              content: '';
              position: absolute;
              left: 0;
              top: 8px;
              width: 8px;
              height: 8px;
              background: var(--accent);
              border-radius: 2px;
              opacity: 0.4;
              transition: all var(--transition);
              transform: rotate(45deg);
            }
            
            li:hover::before {
              opacity: 1;
              transform: rotate(0deg) scale(1.3);
              border-radius: 50%;
            }
            
            ol {
              counter-reset: item;
            }
            
            ol li {
              padding-left: 36px;
            }
            
            ol li::before {
              content: counter(item);
              counter-increment: item;
              width: 22px;
              height: 22px;
              background: var(--bg-elevated);
              border: 1px solid var(--border-light);
              color: var(--text-secondary);
              border-radius: 50%;
              font-size: 0.7rem;
              font-weight: 700;
              display: flex;
              align-items: center;
              justify-content: center;
              top: 2px;
              transform: rotate(0deg);
            }
            
            ol li:hover::before {
              background: var(--accent);
              color: #050505;
              border-color: var(--accent);
              transform: scale(1.1);
              border-radius: 50%;
            }
            
            img {
              max-width: 100%;
              height: auto;
              display: block;
              border-radius: var(--radius-md);
              margin-right: auto;
              transition: transform var(--transition-slow), box-shadow var(--transition-slow);
            }
            
            img:hover {
              transform: scale(1.02);
              box-shadow: var(--shadow-md);
            }
            
            img.rounded {
              border-radius: var(--radius-xl);
            }
            
            img.bordered {
              border: 1px solid var(--border);
              padding: 4px;
              background: var(--bg-secondary);
            }
            
            input, textarea, select {
              width: 100%;
              max-width: 520px;
              padding: 14px 18px;
              background: var(--bg-secondary);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 1rem;
              font-family: inherit;
              transition: all var(--transition);
              outline: none;
              text-align: left;
              margin-right: auto;
              display: block;
            }
            
            input:hover, textarea:hover, select:hover {
              border-color: var(--border-light);
            }
            
            input:focus, textarea:focus, select:focus {
              border-color: var(--border-focus);
              box-shadow: 0 0 0 4px rgba(255, 255, 255, 0.03);
              background: var(--bg-elevated);
            }
            
            input::placeholder, textarea::placeholder {
              color: var(--text-muted);
              font-style: italic;
            }
            
            textarea {
              resize: vertical;
              min-height: 140px;
            }
            
            select {
              cursor: pointer;
              appearance: none;
              -webkit-appearance: none;
              background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='14' height='14' viewBox='0 0 24 24' fill='none' stroke='%23a0a0a0' stroke-width='2'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
              background-repeat: no-repeat;
              background-position: right 16px center;
              padding-right: 48px;
            }
            
            label {
              display: block;
              font-size: 0.9rem;
              font-weight: 600;
              color: var(--text-primary);
              margin-bottom: 8px;
              text-align: left;
              text-transform: uppercase;
              letter-spacing: 0.05em;
            }
            
            .card, .glass-panel {
              background: var(--bg-glass);
              border: 1px solid var(--border);
              border-radius: var(--radius-lg);
              padding: 32px;
              backdrop-filter: blur(24px);
              -webkit-backdrop-filter: blur(24px);
              transition: all var(--transition);
              max-width: 600px;
              margin-right: auto;
              position: relative;
            }
            
            .card::before, .glass-panel::before {
              content: '';
              position: absolute;
              inset: 0;
              border-radius: var(--radius-lg);
              background: linear-gradient(145deg, rgba(255,255,255,0.03) 0%, transparent 80%);
              pointer-events: none;
            }
            
            .card:hover, .glass-panel:hover {
              border-color: var(--border-light);
              box-shadow: var(--shadow-glow), var(--shadow-sm);
              transform: translateY(-3px);
            }
            
            .card-interactive {
              cursor: pointer;
            }
            
            .card-interactive:active {
              transform: translateY(0) scale(0.98);
            }
            
            blockquote {
              border-left: 4px solid var(--accent);
              padding: 16px 24px;
              margin: 2em 0;
              background: var(--bg-elevated);
              border-radius: 0 var(--radius-md) var(--radius-md) 0;
              font-style: italic;
              color: var(--text-secondary);
              max-width: 580px;
            }
            
            blockquote p {
              margin-bottom: 0;
            }
            
            code {
              background: var(--bg-elevated);
              color: #d0d0d0;
              padding: 3px 10px;
              border-radius: 4px;
              font-size: 0.9em;
              font-family: var(--font-mono);
              border: 1px solid var(--border);
            }
            
            pre {
              background: var(--bg-secondary);
              border: 1px solid var(--border);
              border-radius: var(--radius-md);
              padding: 24px;
              overflow-x: auto;
              font-size: 0.9rem;
              line-height: 1.7;
              margin-bottom: 2em;
              max-width: 600px;
              margin-right: auto;
            }
            
            pre code {
              background: none;
              padding: 0;
              border: none;
              color: var(--text-primary);
            }
            
            table {
              width: 100%;
              max-width: 600px;
              border-collapse: collapse;
              margin-bottom: 2em;
              margin-right: auto;
              border-radius: var(--radius-md);
              overflow: hidden;
              border: 1px solid var(--border);
            }
            
            th {
              background: var(--bg-elevated);
              color: var(--text-primary);
              font-weight: 600;
              text-align: left;
              padding: 14px 20px;
              font-size: 0.85rem;
              text-transform: uppercase;
              letter-spacing: 0.08em;
              border-bottom: 2px solid var(--border);
            }
            
            td {
              padding: 12px 20px;
              font-size: 0.95rem;
              color: var(--text-secondary);
              border-bottom: 1px solid var(--border);
              text-align: left;
            }
            
            tr:last-child td {
              border-bottom: none;
            }
            
            tr:hover td {
              background: var(--bg-elevated);
            }
            
            hr, .divider {
              border: none;
              height: 1px;
              background: var(--border);
              margin: 32px 0;
              max-width: 600px;
              margin-right: auto;
            }
            
            hr.short {
              max-width: 80px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
            }
            
            ::-webkit-scrollbar {
              width: 8px;
            }
            
            ::-webkit-scrollbar-track {
              background: var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb {
              background: var(--border-light);
              border-radius: 4px;
              border: 2px solid var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb:hover {
              background: var(--text-muted);
            }
            
            ::selection {
              background: rgba(255, 255, 255, 0.12);
              color: var(--text-primary);
            }
            
            .glow-dot {
              width: 10px;
              height: 10px;
              background: var(--accent);
              border-radius: 50%;
              box-shadow: 0 0 16px rgba(255, 255, 255, 0.5);
              animation: pulse-dot 2s ease-in-out infinite;
              margin-right: auto;
            }
            
            @keyframes pulse-dot {
              0%, 100% { opacity: 0.5; transform: scale(1); }
              50% { opacity: 1; transform: scale(1.5); }
            }
            
            .gradient-text {
              background: linear-gradient(135deg, #ffffff 0%, #777777 70%, #aaaaaa 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            .grid-auto {
              display: grid;
              grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
              gap: 24px;
              max-width: 100%;
            }
            
            .flex-row {
              display: flex;
              align-items: flex-start;
              gap: 20px;
              flex-wrap: wrap;
            }
            
            .flex-column {
              display: flex;
              flex-direction: column;
              align-items: flex-start;
              gap: 16px;
            }
            
            .tag {
              display: inline-block;
              padding: 4px 12px;
              background: var(--bg-elevated);
              border: 1px solid var(--border);
              border-radius: 20px;
              font-size: 0.8rem;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.06em;
            }
            
            .badge {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              min-width: 20px;
              height: 20px;
              padding: 0 6px;
              background: var(--accent);
              color: #050505;
              border-radius: 10px;
              font-size: 0.7rem;
              font-weight: 700;
            }
            
            .separator {
              width: 40px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
              margin: 16px 0;
            }
            
            .muted {
              opacity: 0.5;
            }
            
            .truncate {
              white-space: nowrap;
              overflow: hidden;
              text-overflow: ellipsis;
            }
            
            .visually-hidden {
              position: absolute;
              width: 1px;
              height: 1px;
              padding: 0;
              margin: -1px;
              overflow: hidden;
              clip: rect(0,0,0,0);
              white-space: nowrap;
              border: 0;
            }
            """;
        } else if (ava.contains("left white")){
            return """
            :root {
              --bg-primary: #f8f8f8;
              --bg-secondary: #ffffff;
              --bg-elevated: #f0f0f0;
              --bg-glass: rgba(255, 255, 255, 0.8);
              --text-primary: #0a0a0a;
              --text-secondary: #4a4a4a;
              --text-muted: #999999;
              --accent: #0a0a0a;
              --accent-soft: #333333;
              --accent-glow: #cccccc;
              --border: #e0e0e0;
              --border-light: #d0d0d0;
              --border-focus: #888888;
              --shadow-sm: 0 2px 8px rgba(0, 0, 0, 0.04);
              --shadow-md: 0 8px 40px rgba(0, 0, 0, 0.06);
              --shadow-glow: 0 0 40px rgba(0, 0, 0, 0.02);
              --shadow-button: 0 0 0 0 rgba(0, 0, 0, 0);
              --radius-sm: 6px;
              --radius-md: 12px;
              --radius-lg: 20px;
              --radius-xl: 28px;
              --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-slow: 0.6s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-bounce: 0.4s cubic-bezier(0.34, 1.56, 0.64, 1);
              --font-mono: 'JetBrains Mono', 'Fira Code', 'SF Mono', monospace;
            }
            
            *,
            *::before,
            *::after {
              margin: 0;
              padding: 0;
              box-sizing: border-box;
            }
            
            html {
              scroll-behavior: smooth;
              -webkit-font-smoothing: antialiased;
              -moz-osx-font-smoothing: grayscale;
              font-size: 16px;
            }
            
            body {
              font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
              background: var(--bg-primary);
              color: var(--text-primary);
              line-height: 1.6;
              min-height: 100vh;
              display: flex;
              flex-direction: column;
              align-items: flex-start;
              background-image:
                radial-gradient(ellipse at 15% 20%, rgba(0, 0, 0, 0.02) 0%, transparent 50%),
                radial-gradient(ellipse at 85% 80%, rgba(0, 0, 0, 0.03) 0%, transparent 50%),
                radial-gradient(ellipse at 50% 50%, rgba(0, 0, 0, 0.01) 0%, transparent 100%);
              background-attachment: fixed;
            }
            
            .container {
              max-width: 680px;
              width: 100%;
              margin-left: 0;
              margin-right: auto;
              padding: 80px 48px;
            }
            
            @media (max-width: 768px) {
              .container {
                padding: 40px 24px;
              }
            }
            
            h1, h2, h3, h4, h5, h6 {
              font-weight: 700;
              letter-spacing: -0.04em;
              color: var(--text-primary);
              text-align: left;
              line-height: 1.15;
            }
            
            h1 {
              font-size: clamp(2.8rem, 6vw, 4.5rem);
              margin-bottom: 0.3em;
              letter-spacing: -0.05em;
              background: linear-gradient(135deg, #0a0a0a 0%, #555555 50%, #333333 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            h2 {
              font-size: clamp(1.8rem, 4vw, 2.6rem);
              margin-bottom: 0.4em;
              margin-top: 1.2em;
              color: var(--text-primary);
            }
            
            h3 {
              font-size: clamp(1.3rem, 3vw, 1.6rem);
              margin-bottom: 0.35em;
              margin-top: 1em;
              color: var(--accent-soft);
            }
            
            h4 {
              font-size: clamp(1.1rem, 2.5vw, 1.25rem);
              margin-bottom: 0.3em;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.08em;
            }
            
            h5 {
              font-size: 1rem;
              margin-bottom: 0.25em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.1em;
            }
            
            h6 {
              font-size: 0.8rem;
              margin-bottom: 0.2em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.15em;
            }
            
            p {
              font-size: 1.05rem;
              line-height: 1.75;
              color: var(--text-secondary);
              text-align: left;
              margin-bottom: 1.5em;
              max-width: 580px;
            }
            
            p.lead {
              font-size: 1.25rem;
              line-height: 1.6;
              color: var(--text-primary);
              font-weight: 400;
            }
            
            p.small {
              font-size: 0.85rem;
              color: var(--text-muted);
            }
            
            a {
              color: var(--accent);
              text-decoration: none;
              transition: all var(--transition);
              position: relative;
              font-weight: 500;
            }
            
            a::after {
              content: '';
              position: absolute;
              bottom: -3px;
              left: 0;
              width: 0;
              height: 2px;
              background: var(--accent);
              transition: width var(--transition);
              border-radius: 1px;
            }
            
            a:hover {
              color: var(--accent-soft);
            }
            
            a:hover::after {
              width: 100%;
            }
            
            a:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 4px;
              border-radius: 2px;
            }
            
            button, .btn {
              display: inline-flex;
              align-items: center;
              justify-content: flex-start;
              gap: 10px;
              padding: 14px 32px;
              background: var(--bg-elevated);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 0.95rem;
              font-weight: 500;
              cursor: pointer;
              transition: all var(--transition);
              backdrop-filter: blur(16px);
              -webkit-backdrop-filter: blur(16px);
              user-select: none;
              position: relative;
              overflow: hidden;
              text-align: left;
            }
            
            button::before, .btn::before {
              content: '';
              position: absolute;
              inset: 0;
              background: linear-gradient(135deg, rgba(0,0,0,0.03) 0%, transparent 100%);
              opacity: 0;
              transition: opacity var(--transition);
            }
            
            button:hover, .btn:hover {
              background: #e8e8e8;
              border-color: var(--border-light);
              transform: translateY(-2px);
              box-shadow: var(--shadow-sm);
            }
            
            button:hover::before, .btn:hover::before {
              opacity: 1;
            }
            
            button:active, .btn:active {
              transform: translateY(0) scale(0.97);
              transition: all 0.1s ease;
            }
            
            button:focus-visible, .btn:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 3px;
            }
            
            .btn-primary {
              background: var(--accent);
              color: #ffffff;
              border-color: var(--accent);
              font-weight: 600;
              letter-spacing: 0.01em;
            }
            
            .btn-primary:hover {
              background: #1a1a1a;
              border-color: #1a1a1a;
              color: #ffffff;
              box-shadow: 0 0 40px rgba(0, 0, 0, 0.08);
              transform: translateY(-3px);
            }
            
            .btn-outline {
              background: transparent;
              border: 2px solid var(--border-light);
            }
            
            .btn-outline:hover {
              border-color: var(--accent);
              background: transparent;
            }
            
            .btn-small {
              padding: 8px 18px;
              font-size: 0.85rem;
              border-radius: var(--radius-sm);
            }
            
            .btn-large {
              padding: 18px 40px;
              font-size: 1.1rem;
              border-radius: var(--radius-md);
            }
            
            ul, ol {
              list-style: none;
              padding-left: 0;
              margin-bottom: 2em;
              max-width: 580px;
            }
            
            li {
              position: relative;
              padding-left: 28px;
              font-size: 1.05rem;
              line-height: 1.7;
              color: var(--text-secondary);
              margin-bottom: 0.6em;
              text-align: left;
              transition: color var(--transition);
            }
            
            li:hover {
              color: var(--text-primary);
            }
            
            li::before {
              content: '';
              position: absolute;
              left: 0;
              top: 8px;
              width: 8px;
              height: 8px;
              background: var(--accent);
              border-radius: 2px;
              opacity: 0.4;
              transition: all var(--transition);
              transform: rotate(45deg);
            }
            
            li:hover::before {
              opacity: 1;
              transform: rotate(0deg) scale(1.3);
              border-radius: 50%;
            }
            
            ol {
              counter-reset: item;
            }
            
            ol li {
              padding-left: 36px;
            }
            
            ol li::before {
              content: counter(item);
              counter-increment: item;
              width: 22px;
              height: 22px;
              background: var(--bg-elevated);
              border: 1px solid var(--border-light);
              color: var(--text-secondary);
              border-radius: 50%;
              font-size: 0.7rem;
              font-weight: 700;
              display: flex;
              align-items: center;
              justify-content: center;
              top: 2px;
              transform: rotate(0deg);
            }
            
            ol li:hover::before {
              background: var(--accent);
              color: #ffffff;
              border-color: var(--accent);
              transform: scale(1.1);
              border-radius: 50%;
            }
            
            img {
              max-width: 100%;
              height: auto;
              display: block;
              border-radius: var(--radius-md);
              margin-right: auto;
              transition: transform var(--transition-slow), box-shadow var(--transition-slow);
            }
            
            img:hover {
              transform: scale(1.02);
              box-shadow: var(--shadow-md);
            }
            
            img.rounded {
              border-radius: var(--radius-xl);
            }
            
            img.bordered {
              border: 1px solid var(--border);
              padding: 4px;
              background: var(--bg-secondary);
            }
            
            input, textarea, select {
              width: 100%;
              max-width: 520px;
              padding: 14px 18px;
              background: var(--bg-secondary);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 1rem;
              font-family: inherit;
              transition: all var(--transition);
              outline: none;
              text-align: left;
              margin-right: auto;
              display: block;
            }
            
            input:hover, textarea:hover, select:hover {
              border-color: var(--border-light);
            }
            
            input:focus, textarea:focus, select:focus {
              border-color: var(--border-focus);
              box-shadow: 0 0 0 4px rgba(0, 0, 0, 0.03);
              background: var(--bg-secondary);
            }
            
            input::placeholder, textarea::placeholder {
              color: var(--text-muted);
              font-style: italic;
            }
            
            textarea {
              resize: vertical;
              min-height: 140px;
            }
            
            select {
              cursor: pointer;
              appearance: none;
              -webkit-appearance: none;
              background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='14' height='14' viewBox='0 0 24 24' fill='none' stroke='%23999999' stroke-width='2'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
              background-repeat: no-repeat;
              background-position: right 16px center;
              padding-right: 48px;
            }
            
            label {
              display: block;
              font-size: 0.9rem;
              font-weight: 600;
              color: var(--text-primary);
              margin-bottom: 8px;
              text-align: left;
              text-transform: uppercase;
              letter-spacing: 0.05em;
            }
            
            .card, .glass-panel {
              background: var(--bg-glass);
              border: 1px solid var(--border);
              border-radius: var(--radius-lg);
              padding: 32px;
              backdrop-filter: blur(24px);
              -webkit-backdrop-filter: blur(24px);
              transition: all var(--transition);
              max-width: 600px;
              margin-right: auto;
              position: relative;
            }
            
            .card::before, .glass-panel::before {
              content: '';
              position: absolute;
              inset: 0;
              border-radius: var(--radius-lg);
              background: linear-gradient(145deg, rgba(0,0,0,0.02) 0%, transparent 80%);
              pointer-events: none;
            }
            
            .card:hover, .glass-panel:hover {
              border-color: var(--border-light);
              box-shadow: var(--shadow-glow), var(--shadow-sm);
              transform: translateY(-3px);
            }
            
            .card-interactive {
              cursor: pointer;
            }
            
            .card-interactive:active {
              transform: translateY(0) scale(0.98);
            }
            
            blockquote {
              border-left: 4px solid var(--accent);
              padding: 16px 24px;
              margin: 2em 0;
              background: var(--bg-elevated);
              border-radius: 0 var(--radius-md) var(--radius-md) 0;
              font-style: italic;
              color: var(--text-secondary);
              max-width: 580px;
            }
            
            blockquote p {
              margin-bottom: 0;
            }
            
            code {
              background: var(--bg-elevated);
              color: #333333;
              padding: 3px 10px;
              border-radius: 4px;
              font-size: 0.9em;
              font-family: var(--font-mono);
              border: 1px solid var(--border);
            }
            
            pre {
              background: var(--bg-secondary);
              border: 1px solid var(--border);
              border-radius: var(--radius-md);
              padding: 24px;
              overflow-x: auto;
              font-size: 0.9rem;
              line-height: 1.7;
              margin-bottom: 2em;
              max-width: 600px;
              margin-right: auto;
            }
            
            pre code {
              background: none;
              padding: 0;
              border: none;
              color: var(--text-primary);
            }
            
            table {
              width: 100%;
              max-width: 600px;
              border-collapse: collapse;
              margin-bottom: 2em;
              margin-right: auto;
              border-radius: var(--radius-md);
              overflow: hidden;
              border: 1px solid var(--border);
            }
            
            th {
              background: var(--bg-elevated);
              color: var(--text-primary);
              font-weight: 600;
              text-align: left;
              padding: 14px 20px;
              font-size: 0.85rem;
              text-transform: uppercase;
              letter-spacing: 0.08em;
              border-bottom: 2px solid var(--border);
            }
            
            td {
              padding: 12px 20px;
              font-size: 0.95rem;
              color: var(--text-secondary);
              border-bottom: 1px solid var(--border);
              text-align: left;
            }
            
            tr:last-child td {
              border-bottom: none;
            }
            
            tr:hover td {
              background: var(--bg-elevated);
            }
            
            hr, .divider {
              border: none;
              height: 1px;
              background: var(--border);
              margin: 32px 0;
              max-width: 600px;
              margin-right: auto;
            }
            
            hr.short {
              max-width: 80px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
            }
            
            ::-webkit-scrollbar {
              width: 8px;
            }
            
            ::-webkit-scrollbar-track {
              background: var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb {
              background: var(--border-light);
              border-radius: 4px;
              border: 2px solid var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb:hover {
              background: var(--text-muted);
            }
            
            ::selection {
              background: rgba(0, 0, 0, 0.08);
              color: var(--text-primary);
            }
            
            .glow-dot {
              width: 10px;
              height: 10px;
              background: var(--accent);
              border-radius: 50%;
              box-shadow: 0 0 16px rgba(0, 0, 0, 0.3);
              animation: pulse-dot 2s ease-in-out infinite;
              margin-right: auto;
            }
            
            @keyframes pulse-dot {
              0%, 100% { opacity: 0.5; transform: scale(1); }
              50% { opacity: 1; transform: scale(1.5); }
            }
            
            .gradient-text {
              background: linear-gradient(135deg, #0a0a0a 0%, #777777 70%, #555555 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            .grid-auto {
              display: grid;
              grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
              gap: 24px;
              max-width: 100%;
            }
            
            .flex-row {
              display: flex;
              align-items: flex-start;
              gap: 20px;
              flex-wrap: wrap;
            }
            
            .flex-column {
              display: flex;
              flex-direction: column;
              align-items: flex-start;
              gap: 16px;
            }
            
            .tag {
              display: inline-block;
              padding: 4px 12px;
              background: var(--bg-elevated);
              border: 1px solid var(--border);
              border-radius: 20px;
              font-size: 0.8rem;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.06em;
            }
            
            .badge {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              min-width: 20px;
              height: 20px;
              padding: 0 6px;
              background: var(--accent);
              color: #ffffff;
              border-radius: 10px;
              font-size: 0.7rem;
              font-weight: 700;
            }
            
            .separator {
              width: 40px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
              margin: 16px 0;
            }
            
            .muted {
              opacity: 0.5;
            }
            
            .truncate {
              white-space: nowrap;
              overflow: hidden;
              text-overflow: ellipsis;
            }
            
            .visually-hidden {
              position: absolute;
              width: 1px;
              height: 1px;
              padding: 0;
              margin: -1px;
              overflow: hidden;
              clip: rect(0,0,0,0);
              white-space: nowrap;
              border: 0;
            }
            """;
        }else if (ava.contains("center bleck")) {
            return """
            :root {
              --bg-primary: #050505;
              --bg-secondary: #0a0a0a;
              --bg-elevated: #111111;
              --bg-glass: rgba(10, 10, 10, 0.8);
              --text-primary: #f5f5f5;
              --text-secondary: #a0a0a0;
              --text-muted: #505050;
              --accent: #ffffff;
              --accent-soft: #e0e0e0;
              --accent-glow: #333333;
              --border: #1a1a1a;
              --border-light: #252525;
              --border-focus: #444444;
              --shadow-sm: 0 2px 8px rgba(0, 0, 0, 0.8);
              --shadow-md: 0 8px 40px rgba(0, 0, 0, 0.9);
              --shadow-glow: 0 0 40px rgba(255, 255, 255, 0.02);
              --radius-sm: 6px;
              --radius-md: 12px;
              --radius-lg: 20px;
              --radius-xl: 28px;
              --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-slow: 0.6s cubic-bezier(0.4, 0, 0.2, 1);
              --font-mono: 'JetBrains Mono', 'Fira Code', 'SF Mono', monospace;
            }
            
            *,
            *::before,
            *::after {
              margin: 0;
              padding: 0;
              box-sizing: border-box;
            }
            
            html {
              scroll-behavior: smooth;
              -webkit-font-smoothing: antialiased;
              -moz-osx-font-smoothing: grayscale;
              font-size: 16px;
            }
            
            body {
              font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
              background: var(--bg-primary);
              color: var(--text-primary);
              line-height: 1.6;
              min-height: 100vh;
              display: flex;
              flex-direction: column;
              align-items: center;
              background-image:
                radial-gradient(ellipse at 50% 0%, rgba(40, 40, 40, 0.2) 0%, transparent 50%),
                radial-gradient(ellipse at 50% 100%, rgba(20, 20, 20, 0.15) 0%, transparent 50%);
              background-attachment: fixed;
            }
            
            .container {
              max-width: 680px;
              width: 100%;
              margin: 0 auto;
              padding: 80px 48px;
              text-align: center;
            }
            
            @media (max-width: 768px) {
              .container {
                padding: 40px 24px;
              }
            }
            
            h1, h2, h3, h4, h5, h6 {
              font-weight: 700;
              letter-spacing: -0.04em;
              color: var(--text-primary);
              text-align: center;
              line-height: 1.15;
            }
            
            h1 {
              font-size: clamp(2.8rem, 6vw, 4.5rem);
              margin-bottom: 0.3em;
              letter-spacing: -0.05em;
              background: linear-gradient(135deg, #ffffff 0%, #888888 50%, #cccccc 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            h2 {
              font-size: clamp(1.8rem, 4vw, 2.6rem);
              margin-bottom: 0.4em;
              margin-top: 1.2em;
            }
            
            h3 {
              font-size: clamp(1.3rem, 3vw, 1.6rem);
              margin-bottom: 0.35em;
              margin-top: 1em;
              color: var(--accent-soft);
            }
            
            h4 {
              font-size: clamp(1.1rem, 2.5vw, 1.25rem);
              margin-bottom: 0.3em;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.08em;
            }
            
            h5 {
              font-size: 1rem;
              margin-bottom: 0.25em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.1em;
            }
            
            h6 {
              font-size: 0.8rem;
              margin-bottom: 0.2em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.15em;
            }
            
            p {
              font-size: 1.05rem;
              line-height: 1.75;
              color: var(--text-secondary);
              text-align: center;
              margin-bottom: 1.5em;
              margin-left: auto;
              margin-right: auto;
              max-width: 580px;
            }
            
            p.lead {
              font-size: 1.25rem;
              line-height: 1.6;
              color: var(--text-primary);
              font-weight: 400;
            }
            
            p.small {
              font-size: 0.85rem;
              color: var(--text-muted);
            }
            
            a {
              color: var(--accent);
              text-decoration: none;
              transition: all var(--transition);
              position: relative;
              font-weight: 500;
            }
            
            a::after {
              content: '';
              position: absolute;
              bottom: -3px;
              left: 50%;
              width: 0;
              height: 2px;
              background: var(--accent);
              transition: width var(--transition);
              border-radius: 1px;
              transform: translateX(-50%);
            }
            
            a:hover {
              color: var(--accent-soft);
            }
            
            a:hover::after {
              width: 100%;
            }
            
            a:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 4px;
              border-radius: 2px;
            }
            
            button, .btn {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              gap: 10px;
              padding: 14px 32px;
              background: var(--bg-elevated);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 0.95rem;
              font-weight: 500;
              cursor: pointer;
              transition: all var(--transition);
              backdrop-filter: blur(16px);
              -webkit-backdrop-filter: blur(16px);
              user-select: none;
              position: relative;
              overflow: hidden;
              text-align: center;
              margin-left: auto;
              margin-right: auto;
            }
            
            button::before, .btn::before {
              content: '';
              position: absolute;
              inset: 0;
              background: linear-gradient(135deg, rgba(255,255,255,0.05) 0%, transparent 100%);
              opacity: 0;
              transition: opacity var(--transition);
            }
            
            button:hover, .btn:hover {
              background: var(--border);
              border-color: var(--border-light);
              transform: translateY(-2px);
              box-shadow: var(--shadow-sm);
            }
            
            button:hover::before, .btn:hover::before {
              opacity: 1;
            }
            
            button:active, .btn:active {
              transform: translateY(0) scale(0.97);
              transition: all 0.1s ease;
            }
            
            button:focus-visible, .btn:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 3px;
            }
            
            .btn-primary {
              background: var(--accent);
              color: #050505;
              border-color: var(--accent);
              font-weight: 600;
              letter-spacing: 0.01em;
            }
            
            .btn-primary:hover {
              background: #d0d0d0;
              border-color: #d0d0d0;
              color: #000000;
              box-shadow: 0 0 40px rgba(255, 255, 255, 0.15);
              transform: translateY(-3px);
            }
            
            .btn-outline {
              background: transparent;
              border: 2px solid var(--border-light);
            }
            
            .btn-outline:hover {
              border-color: var(--accent);
              background: transparent;
            }
            
            .btn-small {
              padding: 8px 18px;
              font-size: 0.85rem;
            }
            
            .btn-large {
              padding: 18px 40px;
              font-size: 1.1rem;
              border-radius: var(--radius-md);
            }
            
            ul, ol {
              list-style: none;
              padding-left: 0;
              margin-bottom: 2em;
              max-width: 580px;
              margin-left: auto;
              margin-right: auto;
              text-align: center;
            }
            
            li {
              position: relative;
              padding-left: 28px;
              font-size: 1.05rem;
              line-height: 1.7;
              color: var(--text-secondary);
              margin-bottom: 0.6em;
              text-align: center;
              transition: color var(--transition);
              display: inline-block;
              width: 100%;
            }
            
            li:hover {
              color: var(--text-primary);
            }
            
            li::before {
              content: '';
              position: absolute;
              left: 50%;
              top: 8px;
              width: 8px;
              height: 8px;
              background: var(--accent);
              border-radius: 2px;
              opacity: 0.4;
              transition: all var(--transition);
              transform: translateX(-14px) rotate(45deg);
            }
            
            li:hover::before {
              opacity: 1;
              transform: translateX(-14px) rotate(0deg) scale(1.3);
              border-radius: 50%;
            }
            
            ol {
              counter-reset: item;
            }
            
            ol li {
              padding-left: 36px;
            }
            
            ol li::before {
              content: counter(item);
              counter-increment: item;
              width: 22px;
              height: 22px;
              background: var(--bg-elevated);
              border: 1px solid var(--border-light);
              color: var(--text-secondary);
              border-radius: 50%;
              font-size: 0.7rem;
              font-weight: 700;
              display: flex;
              align-items: center;
              justify-content: center;
              top: 2px;
              transform: translateX(-18px) rotate(0deg);
            }
            
            ol li:hover::before {
              background: var(--accent);
              color: #050505;
              border-color: var(--accent);
              transform: translateX(-18px) scale(1.1);
            }
            
            img {
              max-width: 100%;
              height: auto;
              display: block;
              border-radius: var(--radius-md);
              margin-left: auto;
              margin-right: auto;
              transition: transform var(--transition-slow), box-shadow var(--transition-slow);
            }
            
            img:hover {
              transform: scale(1.02);
              box-shadow: var(--shadow-md);
            }
            
            img.rounded {
              border-radius: var(--radius-xl);
            }
            
            img.bordered {
              border: 1px solid var(--border);
              padding: 4px;
              background: var(--bg-secondary);
            }
            
            input, textarea, select {
              width: 100%;
              max-width: 520px;
              padding: 14px 18px;
              background: var(--bg-secondary);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 1rem;
              font-family: inherit;
              transition: all var(--transition);
              outline: none;
              text-align: center;
              margin-left: auto;
              margin-right: auto;
              display: block;
            }
            
            input:hover, textarea:hover, select:hover {
              border-color: var(--border-light);
            }
            
            input:focus, textarea:focus, select:focus {
              border-color: var(--border-focus);
              box-shadow: 0 0 0 4px rgba(255, 255, 255, 0.03);
              background: var(--bg-elevated);
            }
            
            input::placeholder, textarea::placeholder {
              color: var(--text-muted);
              font-style: italic;
              text-align: center;
            }
            
            textarea {
              resize: vertical;
              min-height: 140px;
            }
            
            select {
              cursor: pointer;
              appearance: none;
              -webkit-appearance: none;
              background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='14' height='14' viewBox='0 0 24 24' fill='none' stroke='%23a0a0a0' stroke-width='2'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
              background-repeat: no-repeat;
              background-position: right 16px center;
              padding-right: 48px;
            }
            
            label {
              display: block;
              font-size: 0.9rem;
              font-weight: 600;
              color: var(--text-primary);
              margin-bottom: 8px;
              text-align: center;
              text-transform: uppercase;
              letter-spacing: 0.05em;
            }
            
            .card, .glass-panel {
              background: var(--bg-glass);
              border: 1px solid var(--border);
              border-radius: var(--radius-lg);
              padding: 32px;
              backdrop-filter: blur(24px);
              -webkit-backdrop-filter: blur(24px);
              transition: all var(--transition);
              max-width: 600px;
              margin-left: auto;
              margin-right: auto;
              position: relative;
              text-align: center;
            }
            
            .card::before, .glass-panel::before {
              content: '';
              position: absolute;
              inset: 0;
              border-radius: var(--radius-lg);
              background: linear-gradient(145deg, rgba(255,255,255,0.03) 0%, transparent 80%);
              pointer-events: none;
            }
            
            .card:hover, .glass-panel:hover {
              border-color: var(--border-light);
              box-shadow: var(--shadow-glow), var(--shadow-sm);
              transform: translateY(-3px);
            }
            
            .card-interactive {
              cursor: pointer;
            }
            
            .card-interactive:active {
              transform: translateY(0) scale(0.98);
            }
            
            blockquote {
              border-left: 4px solid var(--accent);
              padding: 16px 24px;
              margin: 2em auto;
              background: var(--bg-elevated);
              border-radius: 0 var(--radius-md) var(--radius-md) 0;
              font-style: italic;
              color: var(--text-secondary);
              max-width: 580px;
              text-align: center;
            }
            
            blockquote p {
              margin-bottom: 0;
            }
            
            code {
              background: var(--bg-elevated);
              color: #d0d0d0;
              padding: 3px 10px;
              border-radius: 4px;
              font-size: 0.9em;
              font-family: var(--font-mono);
              border: 1px solid var(--border);
            }
            
            pre {
              background: var(--bg-secondary);
              border: 1px solid var(--border);
              border-radius: var(--radius-md);
              padding: 24px;
              overflow-x: auto;
              font-size: 0.9rem;
              line-height: 1.7;
              margin-bottom: 2em;
              max-width: 600px;
              margin-left: auto;
              margin-right: auto;
            }
            
            pre code {
              background: none;
              padding: 0;
              border: none;
              color: var(--text-primary);
            }
            
            table {
              width: 100%;
              max-width: 600px;
              border-collapse: collapse;
              margin-bottom: 2em;
              margin-left: auto;
              margin-right: auto;
              border-radius: var(--radius-md);
              overflow: hidden;
              border: 1px solid var(--border);
            }
            
            th {
              background: var(--bg-elevated);
              color: var(--text-primary);
              font-weight: 600;
              text-align: center;
              padding: 14px 20px;
              font-size: 0.85rem;
              text-transform: uppercase;
              letter-spacing: 0.08em;
              border-bottom: 2px solid var(--border);
            }
            
            td {
              padding: 12px 20px;
              font-size: 0.95rem;
              color: var(--text-secondary);
              border-bottom: 1px solid var(--border);
              text-align: center;
            }
            
            tr:last-child td {
              border-bottom: none;
            }
            
            tr:hover td {
              background: var(--bg-elevated);
            }
            
            hr, .divider {
              border: none;
              height: 1px;
              background: var(--border);
              margin: 32px auto;
              max-width: 600px;
            }
            
            hr.short {
              max-width: 80px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
            }
            
            ::-webkit-scrollbar {
              width: 8px;
            }
            
            ::-webkit-scrollbar-track {
              background: var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb {
              background: var(--border-light);
              border-radius: 4px;
              border: 2px solid var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb:hover {
              background: var(--text-muted);
            }
            
            ::selection {
              background: rgba(255, 255, 255, 0.12);
              color: var(--text-primary);
            }
            
            .glow-dot {
              width: 10px;
              height: 10px;
              background: var(--accent);
              border-radius: 50%;
              box-shadow: 0 0 16px rgba(255, 255, 255, 0.5);
              animation: pulse-dot 2s ease-in-out infinite;
              margin-left: auto;
              margin-right: auto;
            }
            
            @keyframes pulse-dot {
              0%, 100% { opacity: 0.5; transform: scale(1); }
              50% { opacity: 1; transform: scale(1.5); }
            }
            
            .gradient-text {
              background: linear-gradient(135deg, #ffffff 0%, #777777 70%, #aaaaaa 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            .grid-auto {
              display: grid;
              grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
              gap: 24px;
              max-width: 100%;
            }
            
            .flex-row {
              display: flex;
              align-items: center;
              justify-content: center;
              gap: 20px;
              flex-wrap: wrap;
            }
            
            .flex-column {
              display: flex;
              flex-direction: column;
              align-items: center;
              gap: 16px;
            }
            
            .tag {
              display: inline-block;
              padding: 4px 12px;
              background: var(--bg-elevated);
              border: 1px solid var(--border);
              border-radius: 20px;
              font-size: 0.8rem;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.06em;
            }
            
            .badge {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              min-width: 20px;
              height: 20px;
              padding: 0 6px;
              background: var(--accent);
              color: #050505;
              border-radius: 10px;
              font-size: 0.7rem;
              font-weight: 700;
            }
            
            .separator {
              width: 40px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
              margin: 16px auto;
            }
            
            .muted {
              opacity: 0.5;
            }
            
            .truncate {
              white-space: nowrap;
              overflow: hidden;
              text-overflow: ellipsis;
            }
            
            .visually-hidden {
              position: absolute;
              width: 1px;
              height: 1px;
              padding: 0;
              margin: -1px;
              overflow: hidden;
              clip: rect(0,0,0,0);
              white-space: nowrap;
              border: 0;
            }
            """;
        } else if (ava.contains("center white")) {
            return """
            :root {
              --bg-primary: #f8f8f8;
              --bg-secondary: #ffffff;
              --bg-elevated: #f0f0f0;
              --bg-glass: rgba(255, 255, 255, 0.8);
              --text-primary: #0a0a0a;
              --text-secondary: #4a4a4a;
              --text-muted: #999999;
              --accent: #0a0a0a;
              --accent-soft: #333333;
              --accent-glow: #cccccc;
              --border: #e0e0e0;
              --border-light: #d0d0d0;
              --border-focus: #888888;
              --shadow-sm: 0 2px 8px rgba(0, 0, 0, 0.04);
              --shadow-md: 0 8px 40px rgba(0, 0, 0, 0.06);
              --shadow-glow: 0 0 40px rgba(0, 0, 0, 0.02);
              --radius-sm: 6px;
              --radius-md: 12px;
              --radius-lg: 20px;
              --radius-xl: 28px;
              --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
              --transition-slow: 0.6s cubic-bezier(0.4, 0, 0.2, 1);
              --font-mono: 'JetBrains Mono', 'Fira Code', 'SF Mono', monospace;
            }
            
            *,
            *::before,
            *::after {
              margin: 0;
              padding: 0;
              box-sizing: border-box;
            }
            
            html {
              scroll-behavior: smooth;
              -webkit-font-smoothing: antialiased;
              -moz-osx-font-smoothing: grayscale;
              font-size: 16px;
            }
            
            body {
              font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
              background: var(--bg-primary);
              color: var(--text-primary);
              line-height: 1.6;
              min-height: 100vh;
              display: flex;
              flex-direction: column;
              align-items: center;
              background-image:
                radial-gradient(ellipse at 50% 0%, rgba(0, 0, 0, 0.02) 0%, transparent 50%),
                radial-gradient(ellipse at 50% 100%, rgba(0, 0, 0, 0.03) 0%, transparent 50%);
              background-attachment: fixed;
            }
            
            .container {
              max-width: 680px;
              width: 100%;
              margin: 0 auto;
              padding: 80px 48px;
              text-align: center;
            }
            
            @media (max-width: 768px) {
              .container {
                padding: 40px 24px;
              }
            }
            
            h1, h2, h3, h4, h5, h6 {
              font-weight: 700;
              letter-spacing: -0.04em;
              color: var(--text-primary);
              text-align: center;
              line-height: 1.15;
            }
            
            h1 {
              font-size: clamp(2.8rem, 6vw, 4.5rem);
              margin-bottom: 0.3em;
              letter-spacing: -0.05em;
              background: linear-gradient(135deg, #0a0a0a 0%, #555555 50%, #333333 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            h2 {
              font-size: clamp(1.8rem, 4vw, 2.6rem);
              margin-bottom: 0.4em;
              margin-top: 1.2em;
            }
            
            h3 {
              font-size: clamp(1.3rem, 3vw, 1.6rem);
              margin-bottom: 0.35em;
              margin-top: 1em;
              color: var(--accent-soft);
            }
            
            h4 {
              font-size: clamp(1.1rem, 2.5vw, 1.25rem);
              margin-bottom: 0.3em;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.08em;
            }
            
            h5 {
              font-size: 1rem;
              margin-bottom: 0.25em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.1em;
            }
            
            h6 {
              font-size: 0.8rem;
              margin-bottom: 0.2em;
              color: var(--text-muted);
              text-transform: uppercase;
              letter-spacing: 0.15em;
            }
            
            p {
              font-size: 1.05rem;
              line-height: 1.75;
              color: var(--text-secondary);
              text-align: center;
              margin-bottom: 1.5em;
              margin-left: auto;
              margin-right: auto;
              max-width: 580px;
            }
            
            p.lead {
              font-size: 1.25rem;
              line-height: 1.6;
              color: var(--text-primary);
              font-weight: 400;
            }
            
            p.small {
              font-size: 0.85rem;
              color: var(--text-muted);
            }
            
            a {
              color: var(--accent);
              text-decoration: none;
              transition: all var(--transition);
              position: relative;
              font-weight: 500;
            }
            
            a::after {
              content: '';
              position: absolute;
              bottom: -3px;
              left: 50%;
              width: 0;
              height: 2px;
              background: var(--accent);
              transition: width var(--transition);
              border-radius: 1px;
              transform: translateX(-50%);
            }
            
            a:hover {
              color: var(--accent-soft);
            }
            
            a:hover::after {
              width: 100%;
            }
            
            a:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 4px;
              border-radius: 2px;
            }
            
            button, .btn {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              gap: 10px;
              padding: 14px 32px;
              background: var(--bg-elevated);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 0.95rem;
              font-weight: 500;
              cursor: pointer;
              transition: all var(--transition);
              backdrop-filter: blur(16px);
              -webkit-backdrop-filter: blur(16px);
              user-select: none;
              position: relative;
              overflow: hidden;
              text-align: center;
              margin-left: auto;
              margin-right: auto;
            }
            
            button::before, .btn::before {
              content: '';
              position: absolute;
              inset: 0;
              background: linear-gradient(135deg, rgba(0,0,0,0.03) 0%, transparent 100%);
              opacity: 0;
              transition: opacity var(--transition);
            }
            
            button:hover, .btn:hover {
              background: #e8e8e8;
              border-color: var(--border-light);
              transform: translateY(-2px);
              box-shadow: var(--shadow-sm);
            }
            
            button:hover::before, .btn:hover::before {
              opacity: 1;
            }
            
            button:active, .btn:active {
              transform: translateY(0) scale(0.97);
              transition: all 0.1s ease;
            }
            
            button:focus-visible, .btn:focus-visible {
              outline: 2px solid var(--accent);
              outline-offset: 3px;
            }
            
            .btn-primary {
              background: var(--accent);
              color: #ffffff;
              border-color: var(--accent);
              font-weight: 600;
              letter-spacing: 0.01em;
            }
            
            .btn-primary:hover {
              background: #1a1a1a;
              border-color: #1a1a1a;
              color: #ffffff;
              box-shadow: 0 0 40px rgba(0, 0, 0, 0.08);
              transform: translateY(-3px);
            }
            
            .btn-outline {
              background: transparent;
              border: 2px solid var(--border-light);
            }
            
            .btn-outline:hover {
              border-color: var(--accent);
              background: transparent;
            }
            
            .btn-small {
              padding: 8px 18px;
              font-size: 0.85rem;
            }
            
            .btn-large {
              padding: 18px 40px;
              font-size: 1.1rem;
              border-radius: var(--radius-md);
            }
            
            ul, ol {
              list-style: none;
              padding-left: 0;
              margin-bottom: 2em;
              max-width: 580px;
              margin-left: auto;
              margin-right: auto;
              text-align: center;
            }
            
            li {
              position: relative;
              padding-left: 28px;
              font-size: 1.05rem;
              line-height: 1.7;
              color: var(--text-secondary);
              margin-bottom: 0.6em;
              text-align: center;
              transition: color var(--transition);
              display: inline-block;
              width: 100%;
            }
            
            li:hover {
              color: var(--text-primary);
            }
            
            li::before {
              content: '';
              position: absolute;
              left: 50%;
              top: 8px;
              width: 8px;
              height: 8px;
              background: var(--accent);
              border-radius: 2px;
              opacity: 0.4;
              transition: all var(--transition);
              transform: translateX(-14px) rotate(45deg);
            }
            
            li:hover::before {
              opacity: 1;
              transform: translateX(-14px) rotate(0deg) scale(1.3);
              border-radius: 50%;
            }
            
            ol {
              counter-reset: item;
            }
            
            ol li {
              padding-left: 36px;
            }
            
            ol li::before {
              content: counter(item);
              counter-increment: item;
              width: 22px;
              height: 22px;
              background: var(--bg-elevated);
              border: 1px solid var(--border-light);
              color: var(--text-secondary);
              border-radius: 50%;
              font-size: 0.7rem;
              font-weight: 700;
              display: flex;
              align-items: center;
              justify-content: center;
              top: 2px;
              transform: translateX(-18px) rotate(0deg);
            }
            
            ol li:hover::before {
              background: var(--accent);
              color: #ffffff;
              border-color: var(--accent);
              transform: translateX(-18px) scale(1.1);
            }
            
            img {
              max-width: 100%;
              height: auto;
              display: block;
              border-radius: var(--radius-md);
              margin-left: auto;
              margin-right: auto;
              transition: transform var(--transition-slow), box-shadow var(--transition-slow);
            }
            
            img:hover {
              transform: scale(1.02);
              box-shadow: var(--shadow-md);
            }
            
            img.rounded {
              border-radius: var(--radius-xl);
            }
            
            img.bordered {
              border: 1px solid var(--border);
              padding: 4px;
              background: var(--bg-secondary);
            }
            
            input, textarea, select {
              width: 100%;
              max-width: 520px;
              padding: 14px 18px;
              background: var(--bg-secondary);
              color: var(--text-primary);
              border: 1px solid var(--border);
              border-radius: var(--radius-sm);
              font-size: 1rem;
              font-family: inherit;
              transition: all var(--transition);
              outline: none;
              text-align: center;
              margin-left: auto;
              margin-right: auto;
              display: block;
            }
            
            input:hover, textarea:hover, select:hover {
              border-color: var(--border-light);
            }
            
            input:focus, textarea:focus, select:focus {
              border-color: var(--border-focus);
              box-shadow: 0 0 0 4px rgba(0, 0, 0, 0.03);
              background: var(--bg-secondary);
            }
            
            input::placeholder, textarea::placeholder {
              color: var(--text-muted);
              font-style: italic;
              text-align: center;
            }
            
            textarea {
              resize: vertical;
              min-height: 140px;
            }
            
            select {
              cursor: pointer;
              appearance: none;
              -webkit-appearance: none;
              background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='14' height='14' viewBox='0 0 24 24' fill='none' stroke='%23999999' stroke-width='2'%3E%3Cpath d='M6 9l6 6 6-6'/%3E%3C/svg%3E");
              background-repeat: no-repeat;
              background-position: right 16px center;
              padding-right: 48px;
            }
            
            label {
              display: block;
              font-size: 0.9rem;
              font-weight: 600;
              color: var(--text-primary);
              margin-bottom: 8px;
              text-align: center;
              text-transform: uppercase;
              letter-spacing: 0.05em;
            }
            
            .card, .glass-panel {
              background: var(--bg-glass);
              border: 1px solid var(--border);
              border-radius: var(--radius-lg);
              padding: 32px;
              backdrop-filter: blur(24px);
              -webkit-backdrop-filter: blur(24px);
              transition: all var(--transition);
              max-width: 600px;
              margin-left: auto;
              margin-right: auto;
              position: relative;
              text-align: center;
            }
            
            .card::before, .glass-panel::before {
              content: '';
              position: absolute;
              inset: 0;
              border-radius: var(--radius-lg);
              background: linear-gradient(145deg, rgba(0,0,0,0.02) 0%, transparent 80%);
              pointer-events: none;
            }
            
            .card:hover, .glass-panel:hover {
              border-color: var(--border-light);
              box-shadow: var(--shadow-glow), var(--shadow-sm);
              transform: translateY(-3px);
            }
            
            .card-interactive {
              cursor: pointer;
            }
            
            .card-interactive:active {
              transform: translateY(0) scale(0.98);
            }
            
            blockquote {
              border-left: 4px solid var(--accent);
              padding: 16px 24px;
              margin: 2em auto;
              background: var(--bg-elevated);
              border-radius: 0 var(--radius-md) var(--radius-md) 0;
              font-style: italic;
              color: var(--text-secondary);
              max-width: 580px;
              text-align: center;
            }
            
            blockquote p {
              margin-bottom: 0;
            }
            
            code {
              background: var(--bg-elevated);
              color: #333333;
              padding: 3px 10px;
              border-radius: 4px;
              font-size: 0.9em;
              font-family: var(--font-mono);
              border: 1px solid var(--border);
            }
            
            pre {
              background: var(--bg-secondary);
              border: 1px solid var(--border);
              border-radius: var(--radius-md);
              padding: 24px;
              overflow-x: auto;
              font-size: 0.9rem;
              line-height: 1.7;
              margin-bottom: 2em;
              max-width: 600px;
              margin-left: auto;
              margin-right: auto;
            }
            
            pre code {
              background: none;
              padding: 0;
              border: none;
              color: var(--text-primary);
            }
            
            table {
              width: 100%;
              max-width: 600px;
              border-collapse: collapse;
              margin-bottom: 2em;
              margin-left: auto;
              margin-right: auto;
              border-radius: var(--radius-md);
              overflow: hidden;
              border: 1px solid var(--border);
            }
            
            th {
              background: var(--bg-elevated);
              color: var(--text-primary);
              font-weight: 600;
              text-align: center;
              padding: 14px 20px;
              font-size: 0.85rem;
              text-transform: uppercase;
              letter-spacing: 0.08em;
              border-bottom: 2px solid var(--border);
            }
            
            td {
              padding: 12px 20px;
              font-size: 0.95rem;
              color: var(--text-secondary);
              border-bottom: 1px solid var(--border);
              text-align: center;
            }
            
            tr:last-child td {
              border-bottom: none;
            }
            
            tr:hover td {
              background: var(--bg-elevated);
            }
            
            hr, .divider {
              border: none;
              height: 1px;
              background: var(--border);
              margin: 32px auto;
              max-width: 600px;
            }
            
            hr.short {
              max-width: 80px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
            }
            
            ::-webkit-scrollbar {
              width: 8px;
            }
            
            ::-webkit-scrollbar-track {
              background: var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb {
              background: var(--border-light);
              border-radius: 4px;
              border: 2px solid var(--bg-primary);
            }
            
            ::-webkit-scrollbar-thumb:hover {
              background: var(--text-muted);
            }
            
            ::selection {
              background: rgba(0, 0, 0, 0.08);
              color: var(--text-primary);
            }
            
            .glow-dot {
              width: 10px;
              height: 10px;
              background: var(--accent);
              border-radius: 50%;
              box-shadow: 0 0 16px rgba(0, 0, 0, 0.3);
              animation: pulse-dot 2s ease-in-out infinite;
              margin-left: auto;
              margin-right: auto;
            }
            
            @keyframes pulse-dot {
              0%, 100% { opacity: 0.5; transform: scale(1); }
              50% { opacity: 1; transform: scale(1.5); }
            }
            
            .gradient-text {
              background: linear-gradient(135deg, #0a0a0a 0%, #777777 70%, #555555 100%);
              -webkit-background-clip: text;
              -webkit-text-fill-color: transparent;
              background-clip: text;
            }
            
            .grid-auto {
              display: grid;
              grid-template-columns: repeat(auto-fit, minmax(260px, 1fr));
              gap: 24px;
              max-width: 100%;
            }
            
            .flex-row {
              display: flex;
              align-items: center;
              justify-content: center;
              gap: 20px;
              flex-wrap: wrap;
            }
            
            .flex-column {
              display: flex;
              flex-direction: column;
              align-items: center;
              gap: 16px;
            }
            
            .tag {
              display: inline-block;
              padding: 4px 12px;
              background: var(--bg-elevated);
              border: 1px solid var(--border);
              border-radius: 20px;
              font-size: 0.8rem;
              color: var(--text-secondary);
              text-transform: uppercase;
              letter-spacing: 0.06em;
            }
            
            .badge {
              display: inline-flex;
              align-items: center;
              justify-content: center;
              min-width: 20px;
              height: 20px;
              padding: 0 6px;
              background: var(--accent);
              color: #ffffff;
              border-radius: 10px;
              font-size: 0.7rem;
              font-weight: 700;
            }
            
            .separator {
              width: 40px;
              height: 3px;
              background: var(--accent);
              border-radius: 2px;
              margin: 16px auto;
            }
            
            .muted {
              opacity: 0.5;
            }
            
            .truncate {
              white-space: nowrap;
              overflow: hidden;
              text-overflow: ellipsis;
            }
            
            .visually-hidden {
              position: absolute;
              width: 1px;
              height: 1px;
              padding: 0;
              margin: -1px;
              overflow: hidden;
              clip: rect(0,0,0,0);
              white-space: nowrap;
              border: 0;
            }
            """;
        }
        return "ERRRO I DON'T KNOW: " + ava;
    }
}