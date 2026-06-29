package org.example;

public class Lexer {

    public static String get(int num) {
        if (num == 1) {
            return """
                    :root {
                      --bg-primary: #0a0a0a;
                      --bg-secondary: #111111;
                      --bg-elevated: #1a1a1a;
                      --bg-glass: rgba(18, 18, 18, 0.75);
                      --text-primary: #f0f0f0;
                      --text-secondary: #a0a0a0;
                      --text-muted: #555555;
                      --accent: #ffffff;
                      --accent-glow: #444444;
                      --border: #222222;
                      --border-light: #2a2a2a;
                      --gradient-dark: linear-gradient(180deg, #0a0a0a 0%, #050505 100%);
                      --gradient-card: linear-gradient(145deg, #141414 0%, #0d0d0d 100%);
                      --shadow-sm: 0 1px 3px rgba(0, 0, 0, 0.6);
                      --shadow-md: 0 8px 30px rgba(0, 0, 0, 0.8);
                      --shadow-glow: 0 0 20px rgba(255, 255, 255, 0.03);
                      --radius-sm: 8px;
                      --radius-md: 16px;
                      --radius-lg: 24px;
                      --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                      --transition-bounce: 0.4s cubic-bezier(0.34, 1.56, 0.64, 1);
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
                    }
                    
                    body {
                      font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
                      background: var(--bg-primary);
                      color: var(--text-primary);
                      line-height: 1.6;
                      min-height: 100vh;
                      background-image:
                        radial-gradient(ellipse at 50% 0%, rgba(40, 40, 40, 0.15) 0%, transparent 60%),
                        radial-gradient(ellipse at 80% 100%, rgba(30, 30, 30, 0.1) 0%, transparent 50%);
                    }
                    
                    h1, h2, h3, h4, h5, h6 {
                      font-weight: 600;
                      letter-spacing: -0.03em;
                      color: var(--text-primary);
                    }
                    
                    h1 { font-size: clamp(2.2rem, 5vw, 4rem); }
                    h2 { font-size: clamp(1.8rem, 4vw, 2.8rem); }
                    h3 { font-size: clamp(1.3rem, 3vw, 1.8rem); }
                    
                    a {
                      color: var(--text-primary);
                      text-decoration: none;
                      transition: color var(--transition);
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
                      transition: width var(--transition);
                    }
                    
                    a:hover::after {
                      width: 100%;
                    }
                    
                    button, .btn {
                      display: inline-flex;
                      align-items: center;
                      justify-content: center;
                      gap: 8px;
                      padding: 12px 28px;
                      background: var(--bg-elevated);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-sm);
                      font-size: 0.95rem;
                      font-weight: 500;
                      cursor: pointer;
                      transition: all var(--transition);
                      backdrop-filter: blur(10px);
                      user-select: none;
                    }
                    
                    button:hover, .btn:hover {
                      background: var(--border);
                      border-color: var(--border-light);
                      transform: translateY(-1px);
                      box-shadow: var(--shadow-sm);
                    }
                    
                    button:active, .btn:active {
                      transform: translateY(0) scale(0.98);
                    }
                    
                    .btn-primary {
                      background: var(--accent);
                      color: var(--bg-primary);
                      border-color: var(--accent);
                      font-weight: 600;
                    }
                    
                    .btn-primary:hover {
                      background: #e0e0e0;
                      border-color: #e0e0e0;
                      box-shadow: 0 0 30px rgba(255, 255, 255, 0.1);
                    }
                    
                    input, textarea, select {
                      width: 100%;
                      padding: 12px 16px;
                      background: var(--bg-secondary);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-sm);
                      font-size: 0.95rem;
                      font-family: inherit;
                      transition: all var(--transition);
                      outline: none;
                    }
                    
                    input:focus, textarea:focus, select:focus {
                      border-color: var(--border-light);
                      box-shadow: 0 0 0 3px rgba(255, 255, 255, 0.03);
                      background: var(--bg-elevated);
                    }
                    
                    input::placeholder, textarea::placeholder {
                      color: var(--text-muted);
                    }
                    
                    .card, .glass-panel {
                      background: var(--bg-glass);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-md);
                      padding: 24px;
                      backdrop-filter: blur(20px);
                      -webkit-backdrop-filter: blur(20px);
                      transition: all var(--transition);
                    }
                    
                    .card:hover {
                      border-color: var(--border-light);
                      box-shadow: var(--shadow-glow);
                      transform: translateY(-2px);
                    }
                    
                    ::-webkit-scrollbar {
                      width: 6px;
                    }
                    
                    ::-webkit-scrollbar-track {
                      background: var(--bg-primary);
                    }
                    
                    ::-webkit-scrollbar-thumb {
                      background: var(--border-light);
                      border-radius: 3px;
                    }
                    
                    ::-webkit-scrollbar-thumb:hover {
                      background: var(--text-muted);
                    }
                    
                    ::selection {
                      background: rgba(255, 255, 255, 0.15);
                      color: var(--text-primary);
                    }
                    
                    hr, .divider {
                      border: none;
                      height: 1px;
                      background: var(--border);
                      margin: 24px 0;
                    }
                    
                    .glow-dot {
                      width: 8px;
                      height: 8px;
                      background: var(--accent);
                      border-radius: 50%;
                      box-shadow: 0 0 12px rgba(255, 255, 255, 0.4);
                      animation: pulse-dot 2s ease-in-out infinite;
                    }
                    
                    @keyframes pulse-dot {
                      0%, 100% { opacity: 0.6; transform: scale(1); }
                      50% { opacity: 1; transform: scale(1.3); }
                    }
                    
                    .gradient-text {
                      background: linear-gradient(135deg, #ffffff 0%, #888888 100%);
                      -webkit-background-clip: text;
                      -webkit-text-fill-color: transparent;
                      background-clip: text;
                    }
                    
                    .grid-auto {
                      display: grid;
                      grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
                      gap: 20px;
                    }
                    """;
        }

        if (num == 2) {
            return """
                    :root {
                      --bg-primary: #fafafa;
                      --bg-secondary: #ffffff;
                      --bg-elevated: #f5f5f5;
                      --bg-glass: rgba(255, 255, 255, 0.85);
                      --text-primary: #0a0a0a;
                      --text-secondary: #555555;
                      --text-muted: #999999;
                      --accent: #0a0a0a;
                      --accent-glow: #cccccc;
                      --border: #e5e5e5;
                      --border-light: #d5d5d5;
                      --gradient-light: linear-gradient(180deg, #ffffff 0%, #f0f0f0 100%);
                      --gradient-card: linear-gradient(145deg, #ffffff 0%, #f8f8f8 100%);
                      --shadow-sm: 0 1px 3px rgba(0, 0, 0, 0.04);
                      --shadow-md: 0 8px 30px rgba(0, 0, 0, 0.06);
                      --shadow-glow: 0 0 30px rgba(0, 0, 0, 0.03);
                      --radius-sm: 8px;
                      --radius-md: 16px;
                      --radius-lg: 24px;
                      --transition: 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                      --transition-bounce: 0.4s cubic-bezier(0.34, 1.56, 0.64, 1);
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
                    }
                    
                    body {
                      font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
                      background: var(--bg-primary);
                      color: var(--text-primary);
                      line-height: 1.6;
                      min-height: 100vh;
                      background-image:
                        radial-gradient(ellipse at 50% 0%, rgba(0, 0, 0, 0.02) 0%, transparent 60%),
                        radial-gradient(ellipse at 80% 100%, rgba(0, 0, 0, 0.03) 0%, transparent 50%);
                    }
                    
                    h1, h2, h3, h4, h5, h6 {
                      font-weight: 600;
                      letter-spacing: -0.03em;
                      color: var(--text-primary);
                    }
                    
                    h1 { font-size: clamp(2.2rem, 5vw, 4rem); }
                    h2 { font-size: clamp(1.8rem, 4vw, 2.8rem); }
                    h3 { font-size: clamp(1.3rem, 3vw, 1.8rem); }
                    
                    a {
                      color: var(--text-primary);
                      text-decoration: none;
                      transition: color var(--transition);
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
                      transition: width var(--transition);
                    }
                    
                    a:hover::after {
                      width: 100%;
                    }
                    
                    button, .btn {
                      display: inline-flex;
                      align-items: center;
                      justify-content: center;
                      gap: 8px;
                      padding: 12px 28px;
                      background: var(--bg-elevated);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-sm);
                      font-size: 0.95rem;
                      font-weight: 500;
                      cursor: pointer;
                      transition: all var(--transition);
                      backdrop-filter: blur(10px);
                      user-select: none;
                    }
                    
                    button:hover, .btn:hover {
                      background: #ebebeb;
                      border-color: var(--border-light);
                      transform: translateY(-1px);
                      box-shadow: var(--shadow-sm);
                    }
                    
                    button:active, .btn:active {
                      transform: translateY(0) scale(0.98);
                    }
                    
                    .btn-primary {
                      background: var(--accent);
                      color: #ffffff;
                      border-color: var(--accent);
                      font-weight: 600;
                    }
                    
                    .btn-primary:hover {
                      background: #1a1a1a;
                      border-color: #1a1a1a;
                      box-shadow: 0 0 30px rgba(0, 0, 0, 0.08);
                    }
                    
                    input, textarea, select {
                      width: 100%;
                      padding: 12px 16px;
                      background: var(--bg-secondary);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-sm);
                      font-size: 0.95rem;
                      font-family: inherit;
                      transition: all var(--transition);
                      outline: none;
                    }
                    
                    input:focus, textarea:focus, select:focus {
                      border-color: #b0b0b0;
                      box-shadow: 0 0 0 3px rgba(0, 0, 0, 0.03);
                      background: var(--bg-secondary);
                    }
                    
                    input::placeholder, textarea::placeholder {
                      color: var(--text-muted);
                    }
                    
                    .card, .glass-panel {
                      background: var(--bg-glass);
                      border: 1px solid var(--border);
                      border-radius: var(--radius-md);
                      padding: 24px;
                      backdrop-filter: blur(20px);
                      -webkit-backdrop-filter: blur(20px);
                      transition: all var(--transition);
                    }
                    
                    .card:hover {
                      border-color: var(--border-light);
                      box-shadow: var(--shadow-glow);
                      transform: translateY(-2px);
                    }
                    
                    ::-webkit-scrollbar {
                      width: 6px;
                    }
                    
                    ::-webkit-scrollbar-track {
                      background: var(--bg-primary);
                    }
                    
                    ::-webkit-scrollbar-thumb {
                      background: #d0d0d0;
                      border-radius: 3px;
                    }
                    
                    ::-webkit-scrollbar-thumb:hover {
                      background: #a0a0a0;
                    }
                    
                    ::selection {
                      background: rgba(0, 0, 0, 0.08);
                      color: var(--text-primary);
                    }
                    
                    hr, .divider {
                      border: none;
                      height: 1px;
                      background: var(--border);
                      margin: 24px 0;
                    }
                    
                    .glow-dot {
                      width: 8px;
                      height: 8px;
                      background: var(--accent);
                      border-radius: 50%;
                      box-shadow: 0 0 12px rgba(0, 0, 0, 0.15);
                      animation: pulse-dot 2s ease-in-out infinite;
                    }
                    
                    @keyframes pulse-dot {
                      0%, 100% { opacity: 0.4; transform: scale(1); }
                      50% { opacity: 0.8; transform: scale(1.3); }
                    }
                    
                    .gradient-text {
                      background: linear-gradient(135deg, #0a0a0a 0%, #666666 100%);
                      -webkit-background-clip: text;
                      -webkit-text-fill-color: transparent;
                      background-clip: text;
                    }
                    
                    .grid-auto {
                      display: grid;
                      grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
                      gap: 20px;
                    }
                    """;
        }

        if (num == 0) {
            return """
                    /* ROOT — BOTH THEMES */
                    
                    /* ===== BLECK (DARK) ===== */
                    .theme-bleck,
                    [data-theme="bleck"] {
                      --bg-primary: #0a0a0a;
                      --bg-secondary: #111111;
                      --bg-elevated: #1a1a1a;
                      --bg-glass: rgba(18, 18, 18, 0.75);
                      --text-primary: #f0f0f0;
                      --text-secondary: #a0a0a0;
                      --text-muted: #555555;
                      --accent: #ffffff;
                      --accent-glow: #444444;
                      --border: #222222;
                      --border-light: #2a2a2a;
                      --gradient-main: linear-gradient(180deg, #0a0a0a 0%, #050505 100%);
                      --gradient-card: linear-gradient(145deg, #141414 0%, #0d0d0d 100%);
                      --shadow-sm: 0 1px 3px rgba(0, 0, 0, 0.6);
                      --shadow-md: 0 8px 30px rgba(0, 0, 0, 0.8);
                      --shadow-glow: 0 0 20px rgba(255, 255, 255, 0.03);
                      --btn-primary-text: #0a0a0a;
                      --btn-primary-hover: #e0e0e0;
                      --selection-bg: rgba(255, 255, 255, 0.15);
                      --scrollbar-thumb: #2a2a2a;
                      --scrollbar-thumb-hover: #555555;
                      --glow-color: rgba(255, 255, 255, 0.4);
                      --gradient-text: linear-gradient(135deg, #ffffff 0%, #888888 100%);
                      --body-glow-1: rgba(40, 40, 40, 0.15);
                      --body-glow-2: rgba(30, 30, 30, 0.1);
                    }
                    
                    /* ===== WHITE (LIGHT) ===== */
                    .theme-white,
                    [data-theme="white"] {
                      --bg-primary: #fafafa;
                      --bg-secondary: #ffffff;
                      --bg-elevated: #f5f5f5;
                      --bg-glass: rgba(255, 255, 255, 0.85);
                      --text-primary: #0a0a0a;
                      --text-secondary: #555555;
                      --text-muted: #999999;
                      --accent: #0a0a0a;
                      --accent-glow: #cccccc;
                      --border: #e5e5e5;
                      --border-light: #d5d5d5;
                      --gradient-main: linear-gradient(180deg, #ffffff 0%, #f0f0f0 100%);
                      --gradient-card: linear-gradient(145deg, #ffffff 0%, #f8f8f8 100%);
                      --shadow-sm: 0 1px 3px rgba(0, 0, 0, 0.04);
                      --shadow-md: 0 8px 30px rgba(0, 0, 0, 0.06);
                      --shadow-glow: 0 0 30px rgba(0, 0, 0, 0.03);
                      --btn-primary-text: #ffffff;
                      --btn-primary-hover: #1a1a1a;
                      --selection-bg: rgba(0, 0, 0, 0.08);
                      --scrollbar-thumb: #d0d0d0;
                      --scrollbar-thumb-hover: #a0a0a0;
                      --glow-color: rgba(0, 0, 0, 0.15);
                      --gradient-text: linear-gradient(135deg, #0a0a0a 0%, #666666 100%);
                      --body-glow-1: rgba(0, 0, 0, 0.02);
                      --body-glow-2: rgba(0, 0, 0, 0.03);
                    }
                    
                    /* ===== GLOBAL STYLES ===== */
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
                    }
                    
                    body {
                      font-family: 'Inter', 'SF Pro Display', -apple-system, BlinkMacSystemFont, sans-serif;
                      background: var(--bg-primary);
                      color: var(--text-primary);
                      line-height: 1.6;
                      min-height: 100vh;
                      background-image:
                        radial-gradient(ellipse at 50% 0%, var(--body-glow-1) 0%, transparent 60%),
                        radial-gradient(ellipse at 80% 100%, var(--body-glow-2) 0%, transparent 50%);
                      transition: background 0.4s ease, color 0.4s ease;
                    }
                    
                    h1, h2, h3, h4, h5, h6 {
                      font-weight: 600;
                      letter-spacing: -0.03em;
                      color: var(--text-primary);
                      transition: color 0.4s ease;
                    }
                    
                    h1 { font-size: clamp(2.2rem, 5vw, 4rem); }
                    h2 { font-size: clamp(1.8rem, 4vw, 2.8rem); }
                    h3 { font-size: clamp(1.3rem, 3vw, 1.8rem); }
                    
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
                    }
                    
                    button, .btn {
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
                    
                    button:hover, .btn:hover {
                      border-color: var(--border-light);
                      transform: translateY(-1px);
                      box-shadow: var(--shadow-sm);
                    }
                    
                    button:active, .btn:active {
                      transform: translateY(0) scale(0.98);
                    }
                    
                    .btn-primary {
                      background: var(--accent);
                      color: var(--btn-primary-text);
                      border-color: var(--accent);
                      font-weight: 600;
                    }
                    
                    .btn-primary:hover {
                      background: var(--btn-primary-hover);
                      border-color: var(--btn-primary-hover);
                    }
                    
                    input, textarea, select {
                      width: 100%;
                      padding: 12px 16px;
                      background: var(--bg-secondary);
                      color: var(--text-primary);
                      border: 1px solid var(--border);
                      border-radius: 8px;
                      font-size: 0.95rem;
                      font-family: inherit;
                      transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                      outline: none;
                    }
                    
                    input:focus, textarea:focus, select:focus {
                      border-color: var(--border-light);
                      background: var(--bg-secondary);
                    }
                    
                    input::placeholder, textarea::placeholder {
                      color: var(--text-muted);
                    }
                    
                    .card, .glass-panel {
                      background: var(--bg-glass);
                      border: 1px solid var(--border);
                      border-radius: 16px;
                      padding: 24px;
                      backdrop-filter: blur(20px);
                      -webkit-backdrop-filter: blur(20px);
                      transition: all 0.3s cubic-bezier(0.4, 0, 0.2, 1);
                    }
                    
                    .card:hover {
                      border-color: var(--border-light);
                      box-shadow: var(--shadow-glow);
                      transform: translateY(-2px);
                    }
                    
                    ::-webkit-scrollbar {
                      width: 6px;
                    }
                    
                    ::-webkit-scrollbar-track {
                      background: var(--bg-primary);
                    }
                    
                    ::-webkit-scrollbar-thumb {
                      background: var(--scrollbar-thumb);
                      border-radius: 3px;
                    }
                    
                    ::-webkit-scrollbar-thumb:hover {
                      background: var(--scrollbar-thumb-hover);
                    }
                    
                    ::selection {
                      background: var(--selection-bg);
                      color: var(--text-primary);
                    }
                    
                    hr, .divider {
                      border: none;
                      height: 1px;
                      background: var(--border);
                      margin: 24px 0;
                      transition: background 0.4s ease;
                    }
                    
                    .glow-dot {
                      width: 8px;
                      height: 8px;
                      background: var(--accent);
                      border-radius: 50%;
                      box-shadow: 0 0 12px var(--glow-color);
                      animation: pulse-dot 2s ease-in-out infinite;
                      transition: background 0.4s ease, box-shadow 0.4s ease;
                    }
                    
                    @keyframes pulse-dot {
                      0%, 100% { opacity: 0.6; transform: scale(1); }
                      50% { opacity: 1; transform: scale(1.3); }
                    }
                    
                    .gradient-text {
                      background: var(--gradient-text);
                      -webkit-background-clip: text;
                      -webkit-text-fill-color: transparent;
                      background-clip: text;
                    }
                    
                    .grid-auto {
                      display: grid;
                      grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
                      gap: 20px;
                    }
                    """;
        }

        return "ERROR: unknown theme number";
    }
}